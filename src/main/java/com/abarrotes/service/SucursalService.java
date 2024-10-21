/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.SucursalDto;
import com.abarrotes.entidad.Sucursal;
import com.abarrotes.repository.SucursalRepository;
import java.util.ArrayList;
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
    
    public List<SucursalDto> findAll(){
        List<SucursalDto> lstSucursalDto = new ArrayList<>();
        List<Sucursal> lstSucursal = sucursalRepository.findAll();
        for (Sucursal s : lstSucursal) {
            SucursalDto sd = converterEntidadDto(s);
            lstSucursalDto.add(sd);
        }
        
        return lstSucursalDto;
    
    }
    
    public SucursalDto insert(SucursalDto s) {
        return converterEntidadDto(sucursalRepository.save(converterDtoEntidad(s)));
    }
    
    public SucursalDto update(SucursalDto s) {
        return converterEntidadDto(sucursalRepository.save(converterDtoEntidad(s)));
    }
    
    public int delete(SucursalDto s) {
        return sucursalRepository.delete(s.getIdSucursalPk(), '0');
    }
   
    private SucursalDto converterEntidadDto (Sucursal s){
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
    
    private Sucursal converterDtoEntidad (SucursalDto s){
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
