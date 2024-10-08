/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.ExistenciaDto;
import com.abarrotes.entidad.Existencia;
import com.abarrotes.repository.ExistenciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
       
/**
 *
 * @author world
 */

@Service
public class ExistenciaService {
    @Autowired
    ExistenciaRepository existenciaRepository;
    public List<Existencia> findAll(){
    List<Existencia> lstExistenciaDto = existenciaRepository.findAll();
    return lstExistenciaDto;
    }
    
    private ExistenciaDto converterEntidadDto (ExistenciaDto e){
    ExistenciaDto existenciaDto = new ExistenciaDto();
    existenciaDto.setCantidad(e.getCantidad());
    existenciaDto.setCosto(e.getCosto());
    existenciaDto.setIdBodegaFk(e.getIdBodegaFk());
    existenciaDto.setIdExistenciaPk(e.getIdExistenciaPk());
    existenciaDto.setIdProductoFk(e.getIdProductoFk());
    existenciaDto.setKilos(e.getKilos());
    existenciaDto.setPrecioMaximo(e.getPrecioMaximo());
    existenciaDto.setPrecioMinimo(e.getPrecioMinimo());
    existenciaDto.setPrecioVenta(e.getPrecioVenta());
    existenciaDto.setUrlImagen(e.getUrlImagen());
    existenciaDto.setUrlVideo(e.getUrlVideo());
    
    return existenciaDto;
    }
    
    private Existencia converterEntidadDto (Existencia e){
    Existencia existencia = new Existencia();
    existencia.setCantidad(e.getCantidad());
    existencia.setCosto(e.getCosto());
    existencia.setIdBodegaFk(e.getIdBodegaFk());
    existencia.setIdExistenciaPk(e.getIdExistenciaPk());
    existencia.setIdProductoFk(e.getIdProductoFk());
    existencia.setKilos(e.getKilos());
    existencia.setPrecioMaximo(e.getPrecioMaximo());
    existencia.setPrecioMinimo(e.getPrecioMinimo());
    existencia.setPrecioVenta(e.getPrecioVenta());
    existencia.setUrlImagen(e.getUrlImagen());
    existencia.setUrlVideo(e.getUrlVideo());
    
    return existencia;
}

}