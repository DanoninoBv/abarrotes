/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author world
 */
@Entity
@Table(name = "existencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Existencia.findAll", query = "SELECT e FROM Existencia e"),
    @NamedQuery(name = "Existencia.findByIdExistenciaPk", query = "SELECT e FROM Existencia e WHERE e.idExistenciaPk = :idExistenciaPk"),
    @NamedQuery(name = "Existencia.findByCantidad", query = "SELECT e FROM Existencia e WHERE e.cantidad = :cantidad"),
    @NamedQuery(name = "Existencia.findByKilos", query = "SELECT e FROM Existencia e WHERE e.kilos = :kilos"),
    @NamedQuery(name = "Existencia.findByIdProductoFk", query = "SELECT e FROM Existencia e WHERE e.idProductoFk = :idProductoFk"),
    @NamedQuery(name = "Existencia.findByIdBodegaFk", query = "SELECT e FROM Existencia e WHERE e.idBodegaFk = :idBodegaFk"),
    @NamedQuery(name = "Existencia.findByCosto", query = "SELECT e FROM Existencia e WHERE e.costo = :costo"),
    @NamedQuery(name = "Existencia.findByPrecioMinimo", query = "SELECT e FROM Existencia e WHERE e.precioMinimo = :precioMinimo"),
    @NamedQuery(name = "Existencia.findByPrecioVenta", query = "SELECT e FROM Existencia e WHERE e.precioVenta = :precioVenta"),
    @NamedQuery(name = "Existencia.findByPrecioMaximo", query = "SELECT e FROM Existencia e WHERE e.precioMaximo = :precioMaximo"),
    @NamedQuery(name = "Existencia.findByUrlImagen", query = "SELECT e FROM Existencia e WHERE e.urlImagen = :urlImagen"),
    @NamedQuery(name = "Existencia.findByUrlVideo", query = "SELECT e FROM Existencia e WHERE e.urlVideo = :urlVideo")})
public class Existencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_existencia_pk")
    private Integer idExistenciaPk;
    @Column(name = "cantidad")
    private Long cantidad;
    @Column(name = "kilos")
    private Long kilos;
    @Column(name = "id_producto_fk")
    private Integer idProductoFk;
    @Column(name = "id_bodega_fk")
    private Integer idBodegaFk;
    @Column(name = "costo")
    private Long costo;
    @Column(name = "precio_minimo")
    private Long precioMinimo;
    @Column(name = "precio_venta")
    private Long precioVenta;
    @Column(name = "precio_maximo")
    private Long precioMaximo;
    @Column(name = "url_imagen")
    private String urlImagen;
    @Column(name = "url_video")
    private String urlVideo;

    public Existencia() {
    }

    public Existencia(Integer idExistenciaPk) {
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
        if (!(object instanceof Existencia)) {
            return false;
        }
        Existencia other = (Existencia) object;
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
