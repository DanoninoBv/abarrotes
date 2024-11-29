/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.BodegaDto;
import com.abarrotes.entidad.Bodega;
import com.abarrotes.repository.BodegaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */
@Service

public class BodegaService {
    
    @Autowired
    BodegaRepository bodegaRepository;
    
    public List<BodegaDto> findAll(){
        List<BodegaDto> lstBodegaDto = new ArrayList<>();
        List<Bodega> lstBodega = bodegaRepository.findAll();
        for (Bodega b : lstBodega){
            BodegaDto bd = converterEntidadDto(b);
            lstBodegaDto.add(bd);
        }
        
        return lstBodegaDto; 
    }
    
    public BodegaDto insert(BodegaDto b) {
        return converterEntidadDto(bodegaRepository.save(converterDtoEntidad(b)));

    }
    
    public BodegaDto update(BodegaDto b) {
        return converterEntidadDto(bodegaRepository.save(converterDtoEntidad(b)));

    }
    
    public int delete(BodegaDto b){
        return bodegaRepository.delete(b.getIdBodegaPk(), '0');
    }
    
     public List<BodegaDto> select(){
        List<BodegaDto> lstBodegaDto = new ArrayList<>();
        List<Bodega> lstBodega = bodegaRepository.busca();
        for (Bodega b : lstBodega){
            BodegaDto bd = converterEntidadDto(b);
            lstBodegaDto.add(bd);
        }
        
        return lstBodegaDto; 
    }
    
    private BodegaDto converterEntidadDto(Bodega b){
        BodegaDto bodegaDto = new BodegaDto();
        bodegaDto.setDescripcion(b.getDescripcion());
        bodegaDto.setEstatus(b.getEstatus());
        bodegaDto.setFechaAlta(b.getFechaAlta());
        bodegaDto.setIdBodegaPk(b.getIdBodegaPk());
        bodegaDto.setIdUsuarioFk(b.getIdUsuarioFk());
        bodegaDto.setNombre(b.getNombre());
        bodegaDto.setIdSucursalFk(b.getIdSucursalFk());
        
    return bodegaDto;
    }
    private Bodega converterDtoEntidad(BodegaDto b){
        Bodega bodega = new Bodega();
        bodega.setDescripcion(b.getDescripcion());
        bodega.setEstatus(b.getEstatus());
        bodega.setFechaAlta(b.getFechaAlta());
        bodega.setIdBodegaPk(b.getIdBodegaPk());
        bodega.setIdUsuarioFk(b.getIdUsuarioFk());
        bodega.setNombre(b.getNombre());
        bodega.setIdSucursalFk(b.getIdSucursalFk());
    return bodega;
    }
}
