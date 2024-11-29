/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.controller;

import com.abarrotes.dto.ProveedorDto;
import com.abarrotes.dto.UsuarioDto;
import com.abarrotes.service.ProveedorService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
public class ProveedorController implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    private ProveedorService proveedorService;
    private List<ProveedorDto> lstproveedor;
    @Autowired
    private InfoUsuarioController infoUsuario;
    private ProveedorDto proveedor;
    private ProveedorDto proveedorDelete;
    private UsuarioDto usuario;
    private String stateView = "init";

    @PostConstruct
    public void init() {
        usuario = infoUsuario.getUsuario();
        System.out.println("ususario"+ usuario.toString());
        lstproveedor = proveedorService.findAll();
        
        for(ProveedorDto p:lstproveedor){
            System.out.println("for "+p.toString());
        }
        reset();
        stateView = "init";
    }

    public void search() {
        stateView = "search";
    }

    public void viewNew() {
        stateView = "new";
        proveedor = new ProveedorDto();
    }

    public void back() {
        stateView = "init";
        reset();
    }

    private void reset() {
        proveedor = new ProveedorDto();
    }

    public void insert() {
        System.out.println("Registro Insertado Correctamente.");
        if (proveedor.getIdProvedorPk() != null) {
            proveedorService.update(proveedor);
            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Nuevo", "Nuevo registro"));
        } else {
            proveedor.setFechaAlta(new Date());
            proveedor.setEstatus("1");
            proveedor.setSetIdUsuarioFk(usuario.getIdUsuarioPk());
            proveedorService.insert(proveedor);

            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Guardado", "Registro insertado correctamente"));
        }
        init();
//        return "categoria";///regresamos a la pantalla
    }

    public void delete() {
        proveedorDelete.setEstatus("0");
        proveedorService.delete(proveedorDelete);
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Eliminar", "Registro eliminado"));
        init();
    }

    public String getStateView() {
        return stateView;
    }

    public void setStateView(String stateView) {
        this.stateView = stateView;
    }



    public ProveedorDto getCategoriaDelete() {
        return proveedorDelete;
    }

    public void setCategoriaDelete(ProveedorDto categoriaDelete) {
        this.proveedorDelete = categoriaDelete;
    }

       public List<ProveedorDto> getLstproveedor() {
        return lstproveedor;
    }

    public void setLstproveedor(List<ProveedorDto> lstproveedor) {
        this.lstproveedor = lstproveedor;
    }

    public ProveedorDto getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorDto proveedor) {
        this.proveedor = proveedor;
    }



    public ProveedorDto getProveedorDelete() {
        return proveedorDelete;
    }

    public void setProveedorDelete(ProveedorDto proveedorDelete) {
        this.proveedorDelete = proveedorDelete;
    }

}
