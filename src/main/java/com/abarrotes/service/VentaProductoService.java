/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;


import com.abarrotes.dto.VentaProductoDto;
import com.abarrotes.entidad.VentaProducto;
import com.abarrotes.repository.VentaProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */

@Service
public class VentaProductoService {
    @Autowired 
VentaProductoRepository ventaproductoRepository;
    public List<VentaProducto> findAll(){
    List<VentaProducto> lstVentaProductoDto = ventaproductoRepository.findAll();
    return lstVentaProductoDto;
    }
    
    private VentaProductoDto converterEntidadDto (VentaProductoDto v){
    VentaProductoDto ventaproductoDto = new VentaProductoDto();
    ventaproductoDto.setCantidad(v.getCantidad());
    ventaproductoDto.setCantidadAlterna(v.getCantidadAlterna());
    ventaproductoDto.setCostoProducto(v.getCostoProducto());
    ventaproductoDto.setIdProductoFk(v.getIdProductoFk());
    ventaproductoDto.setIdVentaFk(v.getIdVentaFk());
    ventaproductoDto.setIdVentaProductoPk(v.getIdVentaProductoPk());
    ventaproductoDto.setPrecio(v.getPrecio());
    ventaproductoDto.setTotalVenta(v.getTotalVenta());
    
    return ventaproductoDto;
    }
    
    private VentaProducto converterEntidadDto (VentaProducto v){
    VentaProducto ventaproducto = new VentaProducto();
    ventaproducto.setCantidad(v.getCantidad());
    ventaproducto.setCantidadAlterna(v.getCantidadAlterna());
    ventaproducto.setCostoProducto(v.getCostoProducto());
    ventaproducto.setIdProductoFk(v.getIdProductoFk());
    ventaproducto.setIdVentaFk(v.getIdVentaFk());
    ventaproducto.setIdVentaProductoPk(v.getIdVentaProductoPk());
    ventaproducto.setPrecio(v.getPrecio());
    ventaproducto.setTotalVenta(v.getTotalVenta());
    
    return ventaproducto;
    }
    
}
