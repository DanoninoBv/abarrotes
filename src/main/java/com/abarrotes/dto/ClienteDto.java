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

public class ClienteDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idClientePk;
    private String nombre;
    private String empresa;
    private Character sexo;
    private String telefonoCelular;
    private String telefonoFijo;
    private String rfc;
    private Character estatus;
    private Date fechaAlta;
    private Integer idUsuarioFk;
    private Long diasCredito;
    private Long montoCredito;
    private Character tipoPersona;
    private String cp;
    private String direccion;
    private String pais;
    private String correo;
    private Integer idEmpresaFk;
    private String formaPago;
    private String metodoPago;
    private String regimen;
    private Integer idVendedorFk;
    private Integer mandarMebsajePromocion;

    public ClienteDto() {
    }

    public ClienteDto(Integer idClientePk) {
        this.idClientePk = idClientePk;
    }

    public Integer getIdClientePk() {
        return idClientePk;
    }

    public void setIdClientePk(Integer idClientePk) {
        this.idClientePk = idClientePk;
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

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
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

    public Long getDiasCredito() {
        return diasCredito;
    }

    public void setDiasCredito(Long diasCredito) {
        this.diasCredito = diasCredito;
    }

    public Long getMontoCredito() {
        return montoCredito;
    }

    public void setMontoCredito(Long montoCredito) {
        this.montoCredito = montoCredito;
    }

    public Character getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(Character tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getIdEmpresaFk() {
        return idEmpresaFk;
    }

    public void setIdEmpresaFk(Integer idEmpresaFk) {
        this.idEmpresaFk = idEmpresaFk;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public Integer getIdVendedorFk() {
        return idVendedorFk;
    }

    public void setIdVendedorFk(Integer idVendedorFk) {
        this.idVendedorFk = idVendedorFk;
    }

    public Integer getMandarMebsajePromocion() {
        return mandarMebsajePromocion;
    }

    public void setMandarMebsajePromocion(Integer mandarMebsajePromocion) {
        this.mandarMebsajePromocion = mandarMebsajePromocion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClientePk != null ? idClientePk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteDto)) {
            return false;
        }
        ClienteDto other = (ClienteDto) object;
        if ((this.idClientePk == null && other.idClientePk != null) || (this.idClientePk != null && !this.idClientePk.equals(other.idClientePk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Cliente[ idClientePk=" + idClientePk + " ]";
    }
    
}
