/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.EntradaProductoDto;
import com.abarrotes.entidad.EntradaProducto;
import com.abarrotes.repository.EntradaProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */

@Service
public class EntradaProductoService {
    @Autowired
    EntradaProductoRepository entradaproductoRepository;
    public List<EntradaProducto>finAll(){
    List <EntradaProducto> lstEntradaDto = entradaproductoRepository.findAll();
    return lstEntradaDto;
    }
    
private EntradaProductoDto converterEntidadDto (EntradaProductoDto e){
    EntradaProductoDto entradaproductoDto = new EntradaProductoDto();
    entradaproductoDto.setCantidad(e.getCantidad());
    entradaproductoDto.setComentarios(e.getComentarios());
    entradaproductoDto.setCosto(e.getCosto());
    entradaproductoDto.setIdEntradaProductoPk(e.getIdEntradaProductoPk());
    entradaproductoDto.setIndEntradaFk(e.getIndEntradaFk());
    entradaproductoDto.setKilos(e.getKilos());
    return entradaproductoDto;
}    

private EntradaProducto converterEntidadDto (EntradaProducto e){
    EntradaProducto entradaproducto = new EntradaProducto();
    entradaproducto.setCantidad(e.getCantidad());
    entradaproducto.setComentarios(e.getComentarios());
    entradaproducto.setCosto(e.getCosto());
    entradaproducto.setIdEntradaProductoPk(e.getIdEntradaProductoPk());
    entradaproducto.setIndEntradaFk(e.getIndEntradaFk());
    entradaproducto.setKilos(e.getKilos());
    return entradaproducto;
}
}
    