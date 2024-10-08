/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.ProveedorDto;
import com.abarrotes.entidad.Proveedor;
import com.abarrotes.repository.ProveedorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */

@Service
public class ProveedorService {
    @Autowired
ProveedorRepository proveedorRepository;
    public List<Proveedor> findAll(){
    List <Proveedor> lstProveedorDto = proveedorRepository.findAll();
    return lstProveedorDto;
    }
    
    private ProveedorDto converterEntidadDto (ProveedorDto p){
    ProveedorDto proveedorDto = new ProveedorDto();
    proveedorDto.setCorreo(p.getCorreo());
    proveedorDto.setCp(p.getCp());
    proveedorDto.setDireccion(p.getDireccion());
    proveedorDto.setEmpresa(p.getEmpresa());
    proveedorDto.setEstatus(p.getEstatus());
    proveedorDto.setFechaAlta(p.getFechaAlta());
    proveedorDto.setFechaNacimiento(p.getFechaNacimiento());
    proveedorDto.setIdProvedorPk(p.getIdProvedorPk());
    proveedorDto.setNombre(p.getNombre());
    proveedorDto.setNombreCorto(p.getNombreCorto());
    proveedorDto.setPais(p.getPais());
    proveedorDto.setRfcProve(p.getRfcProve());
    proveedorDto.setSexo(p.getSexo());
    proveedorDto.setTelefono(p.getTelefono());
    
    return proveedorDto;
    }
    
    private Proveedor converterEntidadDto (Proveedor p){
    Proveedor proveedor = new Proveedor();
    proveedor.setCorreo(p.getCorreo());
    proveedor.setCp(p.getCp());
    proveedor.setDireccion(p.getDireccion());
    proveedor.setEmpresa(p.getEmpresa());
    proveedor.setEstatus(p.getEstatus());
    proveedor.setFechaAlta(p.getFechaAlta());
    proveedor.setFechaNacimiento(p.getFechaNacimiento());
    proveedor.setIdProvedorPk(p.getIdProvedorPk());
    proveedor.setNombre(p.getNombre());
    proveedor.setNombreCorto(p.getNombreCorto());
    proveedor.setPais(p.getPais());
    proveedor.setRfcProve(p.getRfcProve());
    proveedor.setSexo(p.getSexo());
    proveedor.setTelefono(p.getTelefono());
    
    return proveedor;
    }
    
}
