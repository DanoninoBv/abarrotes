/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.dto;


import java.io.Serializable;


/**
 *
 * @author juanc
 */

public class VentaProductoDto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idVentaProductoPk;
    private Integer idProductoFk;
    private Long precio;
    private Long cantidad;
    private Long cantidadAlterna;
    private Long totalVenta;
    private Integer idVentaFk;
    private Long costoProducto;

    public VentaProductoDto() {
    }

    public VentaProductoDto(Integer idVentaProductoPk) {
        this.idVentaProductoPk = idVentaProductoPk;
    }

    public Integer getIdVentaProductoPk() {
        return idVentaProductoPk;
    }

    public void setIdVentaProductoPk(Integer idVentaProductoPk) {
        this.idVentaProductoPk = idVentaProductoPk;
    }

    public Integer getIdProductoFk() {
        return idProductoFk;
    }

    public void setIdProductoFk(Integer idProductoFk) {
        this.idProductoFk = idProductoFk;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Long getCantidadAlterna() {
        return cantidadAlterna;
    }

    public void setCantidadAlterna(Long cantidadAlterna) {
        this.cantidadAlterna = cantidadAlterna;
    }

    public Long getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Long totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Integer getIdVentaFk() {
        return idVentaFk;
    }

    public void setIdVentaFk(Integer idVentaFk) {
        this.idVentaFk = idVentaFk;
    }

    public Long getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(Long costoProducto) {
        this.costoProducto = costoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVentaProductoPk != null ? idVentaProductoPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaProductoDto)) {
            return false;
        }
        VentaProductoDto other = (VentaProductoDto) object;
        if ((this.idVentaProductoPk == null && other.idVentaProductoPk != null) || (this.idVentaProductoPk != null && !this.idVentaProductoPk.equals(other.idVentaProductoPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidades.VentaProducto[ idVentaProductoPk=" + idVentaProductoPk + " ]";
    }
    
}
