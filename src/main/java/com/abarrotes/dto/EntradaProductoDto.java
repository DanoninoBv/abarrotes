/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.dto;


import java.io.Serializable;


/**
 *
 * @author world
 */

public class EntradaProductoDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idEntradaProductoPk;
    private Integer indEntradaFk;
    private Long kilos;
    private Long cantidad;
    private String comentarios;
    private Long costo;

    public EntradaProductoDto() {
    }

    public EntradaProductoDto(Integer idEntradaProductoPk) {
        this.idEntradaProductoPk = idEntradaProductoPk;
    }

    public Integer getIdEntradaProductoPk() {
        return idEntradaProductoPk;
    }

    public void setIdEntradaProductoPk(Integer idEntradaProductoPk) {
        this.idEntradaProductoPk = idEntradaProductoPk;
    }

    public Integer getIndEntradaFk() {
        return indEntradaFk;
    }

    public void setIndEntradaFk(Integer indEntradaFk) {
        this.indEntradaFk = indEntradaFk;
    }

    public Long getKilos() {
        return kilos;
    }

    public void setKilos(Long kilos) {
        this.kilos = kilos;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Long getCosto() {
        return costo;
    }

    public void setCosto(Long costo) {
        this.costo = costo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntradaProductoPk != null ? idEntradaProductoPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntradaProductoDto)) {
            return false;
        }
        EntradaProductoDto other = (EntradaProductoDto) object;
        if ((this.idEntradaProductoPk == null && other.idEntradaProductoPk != null) || (this.idEntradaProductoPk != null && !this.idEntradaProductoPk.equals(other.idEntradaProductoPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.EntradaProducto[ idEntradaProductoPk=" + idEntradaProductoPk + " ]";
    }
    
}
