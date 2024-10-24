/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.controller;

import com.abarrotes.dto.ClienteDto;
import com.abarrotes.service.ClienteService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author world
 */
@Component
@Scope(value = "view", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClienteController implements Serializable {
    
     private static final long serialVersionUID = 1L;
    @Autowired
    private ClienteService clienteService;
    private List<ClienteDto> lstcliente;

    private ClienteDto cliente;
     private ClienteDto clienteDelete;

    private String stateView = "init";

    @PostConstruct
        public void init (){
        lstcliente = clienteService.findAll();
        reset();
        stateView = "init";
        } 
        
      
        public void search() {
        stateView = "search";
    }

    public void viewNew() {
        stateView = "new";
        cliente = new ClienteDto();
    }

    public void back() {
        stateView = "init";
        reset();
    }

    private void reset() {
        cliente = new ClienteDto();
    }

    public void insert() {
        System.out.println("Registro Insertado Correctamente.");
        if (cliente.getIdClientePk() == null) {
            cliente.setFechaAlta(new Date());
            cliente.setEstatus('1');
            clienteService.insert(cliente);
        } else {
            clienteService.update(cliente);
        }
        init();
//        return "categoria";///regresamos a la pantalla
    }

    public void delete() {
        clienteService.delete(clienteDelete);
        init();
    }

    public String getStateView() {
        return stateView;
    }

    public void setStateView(String stateView) {
        this.stateView = stateView;
    }

    public List<ClienteDto> getLstcategoria() {
        return lstcliente;
    }

    public void setLstcategoria(List<ClienteDto> lstcategoria) {
        this.lstcliente = lstcategoria;
    }

    public ClienteDto getCategoria() {
        return cliente;
    }

    public void setCategoria(ClienteDto categoria) {
        this.cliente = categoria;
    }

    public ClienteDto getCategoriaDelete() {
        return clienteDelete;
    }

    public void setCategoriaDelete(ClienteDto categoriaDelete) {
        this.clienteDelete = categoriaDelete;
    }

    public List<ClienteDto> getLstcliente() {
        return lstcliente;
    }

    public void setLstcliente(List<ClienteDto> lstcliente) {
        this.lstcliente = lstcliente;
    }

    public ClienteDto getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDto cliente) {
        this.cliente = cliente;
    }

    public ClienteDto getClienteDelete() {
        return clienteDelete;
    }

    public void setClienteDelete(ClienteDto clienteDelete) {
        this.clienteDelete = clienteDelete;
    }
    
   
}




