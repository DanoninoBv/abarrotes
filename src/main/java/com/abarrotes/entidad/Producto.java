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
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByIdProductoPk", query = "SELECT p FROM Producto p WHERE p.idProductoPk = :idProductoPk"),
    @NamedQuery(name = "Producto.findByNombre", query = "SELECT p FROM Producto p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Producto.findByDescripcion", query = "SELECT p FROM Producto p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Producto.findByUrlImagen", query = "SELECT p FROM Producto p WHERE p.urlImagen = :urlImagen"),
    @NamedQuery(name = "Producto.findByIdCategoriaFk", query = "SELECT p FROM Producto p WHERE p.idCategoriaFk = :idCategoriaFk"),
    @NamedQuery(name = "Producto.findByCClaveproductoserv", query = "SELECT p FROM Producto p WHERE p.cClaveproductoserv = :cClaveproductoserv"),
    @NamedQuery(name = "Producto.findByClaveUnidad", query = "SELECT p FROM Producto p WHERE p.claveUnidad = :claveUnidad"),
    @NamedQuery(name = "Producto.findByCFraccionarancelariaFk", query = "SELECT p FROM Producto p WHERE p.cFraccionarancelariaFk = :cFraccionarancelariaFk"),
    @NamedQuery(name = "Producto.findByIdExterno", query = "SELECT p FROM Producto p WHERE p.idExterno = :idExterno"),
    @NamedQuery(name = "Producto.findByEstatus", query = "SELECT p FROM Producto p WHERE p.estatus = :estatus"),
    @NamedQuery(name = "Producto.findByServicio", query = "SELECT p FROM Producto p WHERE p.servicio = :servicio")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_producto_pk")
    private Integer idProductoPk;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "url_imagen")
    private String urlImagen;
    @Column(name = "id_categoria_fk")
    private Integer idCategoriaFk;
    @Column(name = "c_claveproductoserv")
    private String cClaveproductoserv;
    @Column(name = "clave_unidad")
    private String claveUnidad;
    @Column(name = "c_fraccionarancelaria_fk")
    private Integer cFraccionarancelariaFk;
    @Column(name = "id_externo")
    private String idExterno;
    @Column(name = "estatus")
    private Character estatus;
    @Column(name = "servicio")
    private Character servicio;

    public Producto() {
    }

    public Producto(Integer idProductoPk) {
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
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
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
