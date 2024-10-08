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

public class EntradaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idEntradaPk;
    private Integer idProveedorFk;
    private Integer movimiento;
    private Date fecha;
    private String remision;
    private Character estatus;
    private Long kilosTotales;
    private Long cantidadesTotales;
    private String comentarios;
    private Date fechaRemision;
    private Date fechaPago;
    private Integer idUsuarioFk;
    private String urlImagen;
    private Date fechaCancelacion;
    private Integer idUsuarioCancelacionFk;
    private Character factura;
    private String numeroFactura;

    public EntradaDto() {
    }

    public EntradaDto(Integer idEntradaPk) {
        this.idEntradaPk = idEntradaPk;
    }

    public Integer getIdEntradaPk() {
        return idEntradaPk;
    }

    public void setIdEntradaPk(Integer idEntradaPk) {
        this.idEntradaPk = idEntradaPk;
    }

    public Integer getIdProveedorFk() {
        return idProveedorFk;
    }

    public void setIdProveedorFk(Integer idProveedorFk) {
        this.idProveedorFk = idProveedorFk;
    }

    public Integer getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Integer movimiento) {
        this.movimiento = movimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRemision() {
        return remision;
    }

    public void setRemision(String remision) {
        this.remision = remision;
    }

    public Character getEstatus() {
        return estatus;
    }

    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }

    public Long getKilosTotales() {
        return kilosTotales;
    }

    public void setKilosTotales(Long kilosTotales) {
        this.kilosTotales = kilosTotales;
    }

    public Long getCantidadesTotales() {
        return cantidadesTotales;
    }

    public void setCantidadesTotales(Long cantidadesTotales) {
        this.cantidadesTotales = cantidadesTotales;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Date getFechaRemision() {
        return fechaRemision;
    }

    public void setFechaRemision(Date fechaRemision) {
        this.fechaRemision = fechaRemision;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Integer getIdUsuarioFk() {
        return idUsuarioFk;
    }

    public void setIdUsuarioFk(Integer idUsuarioFk) {
        this.idUsuarioFk = idUsuarioFk;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public Integer getIdUsuarioCancelacionFk() {
        return idUsuarioCancelacionFk;
    }

    public void setIdUsuarioCancelacionFk(Integer idUsuarioCancelacionFk) {
        this.idUsuarioCancelacionFk = idUsuarioCancelacionFk;
    }

    public Character getFactura() {
        return factura;
    }

    public void setFactura(Character factura) {
        this.factura = factura;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntradaPk != null ? idEntradaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntradaDto)) {
            return false;
        }
        EntradaDto other = (EntradaDto) object;
        if ((this.idEntradaPk == null && other.idEntradaPk != null) || (this.idEntradaPk != null && !this.idEntradaPk.equals(other.idEntradaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Entrada[ idEntradaPk=" + idEntradaPk + " ]";
    }
    
}
