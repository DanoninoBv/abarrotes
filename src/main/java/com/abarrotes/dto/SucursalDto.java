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
public class SucursalDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idSucursalPk;
    private String nombre;
    private String direccion;
    private String cp;
    private String telefono;
    private String estatus;
    private Integer idEmpresaFk;

    public SucursalDto() {
    }

    public SucursalDto(Integer idSucursalPk) {
        this.idSucursalPk = idSucursalPk;
    }

    public Integer getIdSucursalPk() {
        return idSucursalPk;
    }

    public void setIdSucursalPk(Integer idSucursalPk) {
        this.idSucursalPk = idSucursalPk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Integer getIdEmpresaFk() {
        return idEmpresaFk;
    }

    public void setIdEmpresaFk(Integer idEmpresaFk) {
        this.idEmpresaFk = idEmpresaFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSucursalPk != null ? idSucursalPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SucursalDto)) {
            return false;
        }
        SucursalDto other = (SucursalDto) object;
        if ((this.idSucursalPk == null && other.idSucursalPk != null) || (this.idSucursalPk != null && !this.idSucursalPk.equals(other.idSucursalPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Sucursal[ idSucursalPk=" + idSucursalPk + " ]";
    }
    
}
