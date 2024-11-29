/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.dto;


import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author world
 */

public class ProveedorDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idProvedorPk;
    private String nombre;
    private String empresa;
    private String direccion;
    private Character sexo;
    private Date fechaNacimiento;
    private String telefono;
    private String cp;
    private String rfcProve;
    private String estatus;
    private Date fechaAlta;
    private String nombreCorto;
    private String correo;
    private String pais;
    private Integer setIdUsuarioFk;

    
    

    public Integer getSetIdUsuarioFk() {
        return setIdUsuarioFk;
    }

    /**
     *
     * @return
     */
    
    public void setSetIdUsuarioFk(Integer setIdUsuarioFk) {
        this.setIdUsuarioFk = setIdUsuarioFk;
    }

    public ProveedorDto() {
    }

    public ProveedorDto(Integer idProvedorPk) {
        this.idProvedorPk = idProvedorPk;
    }

    public Integer getIdProvedorPk() {
        return idProvedorPk;
    }

    public void setIdProvedorPk(Integer idProvedorPk) {
        this.idProvedorPk = idProvedorPk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getRfcProve() {
        return rfcProve;
    }

    public void setRfcProve(String rfcProve) {
        this.rfcProve = rfcProve;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProvedorPk != null ? idProvedorPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProveedorDto)) {
            return false;
        }
        ProveedorDto other = (ProveedorDto) object;
        if ((this.idProvedorPk == null && other.idProvedorPk != null) || (this.idProvedorPk != null && !this.idProvedorPk.equals(other.idProvedorPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProveedorDto{" + "idProvedorPk=" + idProvedorPk + ", nombre=" + nombre + ", empresa=" + empresa + ", direccion=" + direccion + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", cp=" + cp + ", rfcProve=" + rfcProve + ", estatus=" + estatus + ", fechaAlta=" + fechaAlta + ", nombreCorto=" + nombreCorto + ", correo=" + correo + ", pais=" + pais + ", setIdUsuarioFk=" + setIdUsuarioFk + '}';
    }


    
}
