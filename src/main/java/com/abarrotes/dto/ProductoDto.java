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

public class ProductoDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idProductoPk;
    private String nombre;
    private String descripcion;
    private String urlImagen;
    private Integer idCategoriaFk;
    private String cClaveproductoserv;
    private String claveUnidad;
    private Integer cFraccionarancelariaFk;
    private String idExterno;
    private Character estatus;
    private Character servicio;

    public ProductoDto() {
    }

    public ProductoDto(Integer idProductoPk) {
        this.idProductoPk = idProductoPk;
    }

    public Integer getIdProductoPk() {
        return idProductoPk;
    }

    public void setIdProductoPk(Integer idProductoPk) {
        this.idProductoPk = idProductoPk;
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

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Integer getIdCategoriaFk() {
        return idCategoriaFk;
    }

    public void setIdCategoriaFk(Integer idCategoriaFk) {
        this.idCategoriaFk = idCategoriaFk;
    }

    public String getCClaveproductoserv() {
        return cClaveproductoserv;
    }

    public void setCClaveproductoserv(String cClaveproductoserv) {
        this.cClaveproductoserv = cClaveproductoserv;
    }

    public String getClaveUnidad() {
        return claveUnidad;
    }

    public void setClaveUnidad(String claveUnidad) {
        this.claveUnidad = claveUnidad;
    }

    public Integer getCFraccionarancelariaFk() {
        return cFraccionarancelariaFk;
    }

    public void setCFraccionarancelariaFk(Integer cFraccionarancelariaFk) {
        this.cFraccionarancelariaFk = cFraccionarancelariaFk;
    }

    public String getIdExterno() {
        return idExterno;
    }

    public void setIdExterno(String idExterno) {
        this.idExterno = idExterno;
    }

    public Character getEstatus() {
        return estatus;
    }

    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }

    public Character getServicio() {
        return servicio;
    }

    public void setServicio(Character servicio) {
        this.servicio = servicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoPk != null ? idProductoPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoDto)) {
            return false;
        }
        ProductoDto other = (ProductoDto) object;
        if ((this.idProductoPk == null && other.idProductoPk != null) || (this.idProductoPk != null && !this.idProductoPk.equals(other.idProductoPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Producto[ idProductoPk=" + idProductoPk + " ]";
    }
    
}
