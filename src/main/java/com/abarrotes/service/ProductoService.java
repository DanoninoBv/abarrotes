/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.ProductoDto;
import com.abarrotes.entidad.Producto;
import com.abarrotes.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */

@Service
public class ProductoService {
    @Autowired 
ProductoRepository productoRepository;
    public List<Producto> findAll(){
    List <Producto> lstProductoDto = productoRepository.findAll();
    return lstProductoDto;
    }
    
    private ProductoDto converterEntidadDto (ProductoDto p){
    ProductoDto productoDto = new ProductoDto();
    productoDto.setCClaveproductoserv(p.getCClaveproductoserv());
    productoDto.setCFraccionarancelariaFk(p.getCFraccionarancelariaFk());
    productoDto.setClaveUnidad(p.getClaveUnidad());
    productoDto.setDescripcion(p.getDescripcion());
    productoDto.setEstatus(p.getEstatus());
    productoDto.setIdCategoriaFk(p.getIdCategoriaFk());
    productoDto.setIdExterno(p.getIdExterno());
    productoDto.setIdProductoPk(p.getIdProductoPk());
    productoDto.setNombre(p.getNombre());
    productoDto.setServicio(p.getServicio());
    productoDto.setUrlImagen(p.getUrlImagen());
    
    return productoDto;
    }
    
    private Producto converterEntidadDto (Producto p){
    Producto producto = new Producto();
    producto.setCClaveproductoserv(p.getCClaveproductoserv());
    producto.setCFraccionarancelariaFk(p.getCFraccionarancelariaFk());
    producto.setClaveUnidad(p.getClaveUnidad());
    producto.setDescripcion(p.getDescripcion());
    producto.setEstatus(p.getEstatus());
    producto.setIdCategoriaFk(p.getIdCategoriaFk());
    producto.setIdExterno(p.getIdExterno());
    producto.setIdProductoPk(p.getIdProductoPk());
    producto.setNombre(p.getNombre());
    producto.setServicio(p.getServicio());
    producto.setUrlImagen(p.getUrlImagen());
    
    return producto;
}
}