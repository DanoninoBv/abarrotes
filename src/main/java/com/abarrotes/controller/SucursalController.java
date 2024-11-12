/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.controller;

import com.abarrotes.dto.EmpresaDto;
import com.abarrotes.dto.SucursalDto;
import com.abarrotes.dto.UsuarioDto;
import com.abarrotes.service.EmpresaService;
import com.abarrotes.service.SucursalService;
import java.io.Serializable;
import java.util.ArrayList;
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
public class SucursalController implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    private InfoUsuarioController infoUsuario;
    @Autowired
    private SucursalService sucursalService;
    @Autowired
    private EmpresaService empresaService;

    private List<SucursalDto> lstsucursal;
    private List<EmpresaDto> lstEmpresa;
    private SucursalDto sucursal;
    private SucursalDto sucursalDelete;
    private EmpresaDto empresa;

    private String stateView = "init";
        
    @PostConstruct
    public void init() {
        UsuarioDto usuario = infoUsuario.getUsuario();
        
        lstEmpresa = empresaService.findAll();
        lstsucursal = sucursalService.select();
        reset();
        stateView = "init";
    }

    public void search() {
        stateView = "search";
    }

    public void viewNew() {
        stateView = "new";
        sucursal = new SucursalDto();
    }

    public void back() {
        stateView = "init";
        reset();
    }

    private void reset() {
        sucursal = new SucursalDto();
    }

    public void insert() {
        System.out.println("Registro Inertado Correctamente");
        if (sucursal.getIdSucursalPk() == null) {
            sucursal.setEstatus('1');
            sucursal.setIdEmpresaFk(empresa.getIdEmpresaPk());
            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Guardado", "Registro insertado correctamente"));
        } else {
            sucursalService.update(sucursal);
            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Nuevo", "Nuevo registro"));
        }
        init();
    }

    public void delete() {
        sucursalService.delete(sucursalDelete);
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Eliminar", "Registro eliminado"));
        init();
    }

    public String getStateView() {
        return stateView;
    }

    public void setStateView(String stateView) {
        this.stateView = stateView;
    }

    public List<SucursalDto> getLstsucursal() {
        return lstsucursal;
    }

    public void setLstsucursal(List<SucursalDto> lstsucursal) {
        this.lstsucursal = lstsucursal;
    }

 

    public SucursalDto getSucursal() {
        return sucursal;
    }

    public void setSucursal(SucursalDto sucursal) {
        this.sucursal = sucursal;
    }

    public SucursalDto getSucursalDelete() {
        return sucursalDelete;
    }

    public List<EmpresaDto> getLstEmpresa() {
        return lstEmpresa;
    }

    public void setSucuralDelete(SucursalDto sucursalDelete) {
        this.sucursalDelete = sucursalDelete;
    }

    public void setLstsucursal(ArrayList<SucursalDto> lstsucursal) {
        this.lstsucursal = lstsucursal;
    }
}
