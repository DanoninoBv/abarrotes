/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;


import com.abarrotes.dto.EntradaDto;
import com.abarrotes.entidad.Entrada;
import com.abarrotes.repository.EntradaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */

@Service
public class EntradaService {
    @Autowired
    EntradaRepository entradaRepository;
    public List<Entrada>findAll(){
    List <Entrada> lstEntradaDto = entradaRepository.findAll();
    return lstEntradaDto;
    }


private EntradaDto converterEntidadDto (EntradaDto e){
      EntradaDto entradaDto = new EntradaDto();
      entradaDto.setCantidadesTotales(e.getCantidadesTotales());
      entradaDto.setComentarios(e.getComentarios());
      entradaDto.setEstatus(e.getEstatus());
      entradaDto.setFactura(e.getFactura());
      entradaDto.setFecha(e.getFecha());
      entradaDto.setFechaCancelacion(e.getFechaCancelacion());
      entradaDto.setFechaPago(e.getFechaPago());
      entradaDto.setFechaRemision(e.getFechaRemision());
      entradaDto.setIdEntradaPk(e.getIdEntradaPk());
      entradaDto.setIdProveedorFk(e.getIdProveedorFk());
      entradaDto.setIdUsuarioCancelacionFk(e.getIdUsuarioCancelacionFk());
      entradaDto.setIdUsuarioFk(e.getIdUsuarioFk());
      entradaDto.setKilosTotales(e.getKilosTotales());
      entradaDto.setMovimiento(e.getMovimiento());
      entradaDto.setNumeroFactura(e.getNumeroFactura());
      entradaDto.setRemision(e.getRemision());
      entradaDto.setUrlImagen(e.getUrlImagen());
      
      return entradaDto;
}

   private Entrada converterEntidadDto (Entrada e){
      Entrada entrada = new Entrada();
      entrada.setCantidadesTotales(e.getCantidadesTotales());
      entrada.setComentarios(e.getComentarios());
      entrada.setEstatus(e.getEstatus());
      entrada.setFactura(e.getFactura());
      entrada.setFecha(e.getFecha());
      entrada.setFechaCancelacion(e.getFechaCancelacion());
      entrada.setFechaPago(e.getFechaPago());
      entrada.setFechaRemision(e.getFechaRemision());
      entrada.setIdEntradaPk(e.getIdEntradaPk());
      entrada.setIdProveedorFk(e.getIdProveedorFk());
      entrada.setIdUsuarioCancelacionFk(e.getIdUsuarioCancelacionFk());
      entrada.setIdUsuarioFk(e.getIdUsuarioFk());
      entrada.setKilosTotales(e.getKilosTotales());
      entrada.setMovimiento(e.getMovimiento());
      entrada.setNumeroFactura(e.getNumeroFactura());
      entrada.setRemision(e.getRemision());
      entrada.setUrlImagen(e.getUrlImagen());
      
      return entrada;
}


}

