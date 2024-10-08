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

public class ExistenciaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idExistenciaPk;
    private Long cantidad;
    private Long kilos;
    private Integer idProductoFk;
    private Integer idBodegaFk;
    private Long costo;
    private Long precioMinimo;
    private Long precioVenta;
    private Long precioMaximo;
    private String urlImagen;
    private String urlVideo;

    public ExistenciaDto() {
    }

    public ExistenciaDto(Integer idExistenciaPk) {
        this.idExistenciaPk = idExistenciaPk;
    }

    public Integer getIdExistenciaPk() {
        return idExistenciaPk;
    }

    public void setIdExistenciaPk(Integer idExistenciaPk) {
        this.idExistenciaPk = idExistenciaPk;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Long getKilos() {
        return kilos;
    }

    public void setKilos(Long kilos) {
        this.kilos = kilos;
    }

    public Integer getIdProductoFk() {
        return idProductoFk;
    }

    public void setIdProductoFk(Integer idProductoFk) {
        this.idProductoFk = idProductoFk;
    }

    public Integer getIdBodegaFk() {
        return idBodegaFk;
    }

    public void setIdBodegaFk(Integer idBodegaFk) {
        this.idBodegaFk = idBodegaFk;
    }

    public Long getCosto() {
        return costo;
    }

    public void setCosto(Long costo) {
        this.costo = costo;
    }

    public Long getPrecioMinimo() {
        return precioMinimo;
    }

    public void setPrecioMinimo(Long precioMinimo) {
        this.precioMinimo = precioMinimo;
    }

    public Long getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Long precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Long getPrecioMaximo() {
        return precioMaximo;
    }

    public void setPrecioMaximo(Long precioMaximo) {
        this.precioMaximo = precioMaximo;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExistenciaPk != null ? idExistenciaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExistenciaDto)) {
            return false;
        }
        ExistenciaDto other = (ExistenciaDto) object;
        if ((this.idExistenciaPk == null && other.idExistenciaPk != null) || (this.idExistenciaPk != null && !this.idExistenciaPk.equals(other.idExistenciaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Existencia[ idExistenciaPk=" + idExistenciaPk + " ]";
    }
    
}
