/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.VentaDto;
import com.abarrotes.entidad.Venta;
import com.abarrotes.repository.VentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */

@Service
public class VentaService {
    @Autowired 
  VentaRepository ventaRepository;
    public List<Venta> findAll(){
    List <Venta> lstVentaDto = ventaRepository.findAll();
    return lstVentaDto;
    }
    
    private VentaDto converterEntidadDto (VentaDto v){
    VentaDto ventaDto = new VentaDto();
    ventaDto.setComentariosCancel(v.getComentariosCancel());
    ventaDto.setEstatusFactura(v.getEstatusFactura());
    ventaDto.setEstatusFk(v.getEstatusFk());
    ventaDto.setFactura(v.getFactura());
    ventaDto.setFechaCancelacion(v.getFechaCancelacion());
    ventaDto.setFechaEntrega(v.getFechaEntrega());
    ventaDto.setFechaPago(v.getFechaPago());
    ventaDto.setFechaPromesaPago(v.getFechaPromesaPago());
    ventaDto.setFechaVenta(v.getFechaVenta());
    ventaDto.setFolioSucursal(v.getFolioSucursal());
    ventaDto.setIdCajeroFk(v.getIdCajeroFk());
    ventaDto.setIdCancelUserFk(v.getIdCancelUserFk());
    ventaDto.setIdClienteFk(v.getIdClienteFk());
    ventaDto.setIdEntregaUserFk(v.getIdEntregaUserFk());
    ventaDto.setIdSucursalFk(v.getIdSucursalFk());
    ventaDto.setIdUsuariologFk(v.getIdUsuariologFk());
    ventaDto.setIdVendedorFk(v.getIdVendedorFk());
    ventaDto.setIdVentaPk(v.getIdVentaPk());
    ventaDto.setTipoVenta(v.getTipoVenta());
    
    return ventaDto;
 }
    
    private Venta converterEntidad (Venta v){
    Venta venta = new Venta();
    venta.setComentariosCancel(v.getComentariosCancel());
    venta.setEstatusFactura(v.getEstatusFactura());
    venta.setEstatusFk(v.getEstatusFk());
    venta.setFactura(v.getFactura());
    venta.setFechaCancelacion(v.getFechaCancelacion());
    venta.setFechaEntrega(v.getFechaEntrega());
    venta.setFechaPago(v.getFechaPago());
    venta.setFechaPromesaPago(v.getFechaPromesaPago());
    venta.setFechaVenta(v.getFechaVenta());
    venta.setFolioSucursal(v.getFolioSucursal());
    venta.setIdCajeroFk(v.getIdCajeroFk());
    venta.setIdCancelUserFk(v.getIdCancelUserFk());
    venta.setIdClienteFk(v.getIdClienteFk());
    venta.setIdEntregaUserFk(v.getIdEntregaUserFk());
    venta.setIdSucursalFk(v.getIdSucursalFk());
    venta.setIdUsuariologFk(v.getIdUsuariologFk());
    venta.setIdVendedorFk(v.getIdVendedorFk());
    venta.setIdVentaPk(v.getIdVentaPk());
    venta.setTipoVenta(v.getTipoVenta());
    
    return venta;
 }
}
