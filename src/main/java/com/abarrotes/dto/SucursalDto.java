/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.dto;

import com.abarrotes.entidad.*;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

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
    private Character estatus;
    private Empresa idEmpresaFk;
    private List<Usuario> usuarioList;

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

    public Character getEstatus() {
        return estatus;
    }

    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }

    public Empresa getIdEmpresaFk() {
        return idEmpresaFk;
    }

    public void setIdEmpresaFk(Empresa idEmpresaFk) {
        this.idEmpresaFk = idEmpresaFk;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
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
