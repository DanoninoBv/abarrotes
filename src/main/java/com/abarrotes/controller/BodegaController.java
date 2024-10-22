/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.controller;

import com.abarrotes.dto.BodegaDto;
import com.abarrotes.dto.SucursalDto;
import com.abarrotes.dto.UsuarioDto;
import com.abarrotes.entidad.Bodega;
import com.abarrotes.service.BodegaService;
import com.abarrotes.service.SucursalService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import static org.aspectj.bridge.context.CompilationAndWeavingContext.reset;
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
public class BodegaController implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    private BodegaService bodegaService;
    @Autowired
    private SucursalService sucursalService;
    @Autowired
    private InfoUsuarioController infoUsuario;
    private List<BodegaDto> lstbodega;
    private List<SucursalDto> lstSucursal;
    private BodegaDto bodega;
    private BodegaDto bodegaDelete;
    private UsuarioDto usuario;

    private String stateView = "init";

    @PostConstruct
    public void init() {
        lstSucursal = sucursalService.findAll();
        lstbodega = bodegaService.findAll();
        usuario = infoUsuario.getUsuario();
        System.out.println("usuario "+usuario.toString());
        reset();
        stateView = "init";
    }

    public void search() {
        stateView = "search";
    }

    public void viewNew() {
        stateView = "new";
        bodega = new BodegaDto();
    }

    public void back() {
        stateView = "init";
        reset();
    }

    private void reset() {
        bodega = new BodegaDto();
    }

    public void insert() {
        System.out.println("Registro Insertado Correctamente.");
        if (bodega.getIdBodegaPk() == null) {
            bodega.setEstatus('1');
            bodega.setFechaAlta(new Date());
            bodega.setIdUsuarioFk(usuario.getIdUsuarioPk());
            bodegaService.insert(bodega);
        } else {
            bodegaService.update(bodega);
        }
        init();
        // return "bodega";
    }

    public void delete() {
        bodegaDelete.setEstatus('0');
        bodegaService.delete(bodegaDelete);
        init();
    }

    public String getStateView() {
        return stateView;
    }

    public void setStateView(String stateView) {
        this.stateView = stateView;
    }

    public List<BodegaDto> getLstbodega() {
        return lstbodega;
    }

    public void setLstbodega(List<BodegaDto> lstbodega) {
        this.lstbodega = lstbodega;
    }

    public BodegaDto getBodega() {
        return bodega;
    }

    public void setBodega(BodegaDto bodega) {
        this.bodega = bodega;
    }

    public BodegaDto getBodegaDelete() {
        return bodegaDelete;
    }

    public void setBodegaDelete(BodegaDto bodegaDelete) {
        this.bodegaDelete = bodegaDelete;
    }

    public List<SucursalDto> getLstSucursal() {
        return lstSucursal;
    }

    public void setLstSucursal(List<SucursalDto> lstSucursal) {
        this.lstSucursal = lstSucursal;
    }

    public void setLstbodega(ArrayList<BodegaDto> lstbodega) {
        this.lstbodega = lstbodega;
    }
}
