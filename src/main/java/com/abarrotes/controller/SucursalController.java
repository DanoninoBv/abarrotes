/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.controller;

import com.abarrotes.dto.SucursalDto;
import com.abarrotes.service.SucursalService;
import java.io.Serializable;
import java.util.ArrayList;
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
public class SucursalController implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Autowired
    private SucursalService sucursalService;
    private List<SucursalDto> lstsucursal;
    
    private SucursalDto sucursal;
    private SucursalDto sucursalDelete;
    
    private String stateView = "init";
    
    @PostConstruct
        public void init (){
            lstsucursal = sucursalService.findAll();
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
        
        private void reset(){
            sucursal = new SucursalDto();
        }
        
        public void insert() {
            System.out.println("Registro Inertado Correctamente");
            if (sucursal.getIdSucursalPk() == null) {
                sucursal.setNombre(stateView);
                sucursal.setDireccion(stateView);
                sucursal.setCp(stateView);
            } else {
                sucursalService.update(sucursal);
            }
            init();
        }
        
        public void delete() {
            sucursalDelete.setDireccion(stateView);
            sucursalService.delete(sucursalDelete);
            init();
        }
        
        public String getStateView() {
            return stateView;
        }
        
        public List<SucursalDto> getLstbodega() {
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
        
        public void setSucuralDelete(SucursalDto sucursalDelete) {
            this.sucursalDelete = sucursalDelete;
        }
        
        public void setLstsucursal(ArrayList<SucursalDto> lstsucursal) {
            this.lstsucursal = lstsucursal;
        }
}
