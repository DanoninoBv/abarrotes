/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.SucursalDto;
import com.abarrotes.entidad.Sucursal;
import com.abarrotes.repository.SucursalRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */

@Service
public class SucursalService {
    @Autowired
SucursalRepository sucursalRepository;
    public List<Sucursal> findAll(){
    List <Sucursal> lstSucursalDto = sucursalRepository.findAll();
    return lstSucursalDto;
    }
   
    private SucursalDto converterEntidadDto (SucursalDto s){
    SucursalDto sucursalDto = new SucursalDto();
    sucursalDto.setCp(s.getCp());
    sucursalDto.setDireccion(s.getDireccion());
    sucursalDto.setEstatus(s.getEstatus());
    sucursalDto.setIdEmpresaFk(s.getIdEmpresaFk());
    sucursalDto.setIdSucursalPk(s.getIdSucursalPk());
    sucursalDto.setNombre(s.getNombre());
    sucursalDto.setTelefono(s.getTelefono());
    sucursalDto.setUsuarioList(s.getUsuarioList());
    
    return sucursalDto;
    } 
    
    private Sucursal converterEntidadDto (Sucursal s){
    Sucursal sucursal = new Sucursal();
    sucursal.setCp(s.getCp());
    sucursal.setDireccion(s.getDireccion());
    sucursal.setEstatus(s.getEstatus());
    sucursal.setIdEmpresaFk(s.getIdEmpresaFk());
    sucursal.setIdSucursalPk(s.getIdSucursalPk());
    sucursal.setNombre(s.getNombre());
    sucursal.setTelefono(s.getTelefono());
    sucursal.setUsuarioList(s.getUsuarioList());
    
    return sucursal;
    } 
    
}
