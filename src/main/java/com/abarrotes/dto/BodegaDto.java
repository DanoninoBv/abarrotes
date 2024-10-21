/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.dto;

import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author juanc
 */

public class BodegaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idBodegaPk;
    private String nombre;
    private String descripcion;
    private Character estatus;
    private Date fechaAlta;
    private Integer idUsuarioFk;
    private Integer idSucursalFk;

    
    public BodegaDto() {
    }

    public BodegaDto(Integer idBodegaPk) {
        this.idBodegaPk = idBodegaPk;
    }

    public Integer getIdBodegaPk() {
        return idBodegaPk;
    }

    public void setIdBodegaPk(Integer idBodegaPk) {
        this.idBodegaPk = idBodegaPk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstatus() {
        return estatus;
    }

    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdUsuarioFk() {
        return idUsuarioFk;
    }

    public void setIdUsuarioFk(Integer idUsuarioFk) {
        this.idUsuarioFk = idUsuarioFk;
    }

    public Integer getIdSucursalFk() {
        return idSucursalFk;
    }

    public void setIdSucursalFk(Integer idSucursalFk) {
        this.idSucursalFk = idSucursalFk;
    }

    
    
  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBodegaPk != null ? idBodegaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BodegaDto)) {
            return false;
        }
        BodegaDto other = (BodegaDto) object;
        if ((this.idBodegaPk == null && other.idBodegaPk != null) || (this.idBodegaPk != null && !this.idBodegaPk.equals(other.idBodegaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidades.Bodega[ idBodegaPk=" + idBodegaPk + " ]";
    }
    
}