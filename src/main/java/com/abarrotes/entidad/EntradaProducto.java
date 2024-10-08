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
@Table(name = "entrada_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EntradaProducto.findAll", query = "SELECT e FROM EntradaProducto e"),
    @NamedQuery(name = "EntradaProducto.findByIdEntradaProductoPk", query = "SELECT e FROM EntradaProducto e WHERE e.idEntradaProductoPk = :idEntradaProductoPk"),
    @NamedQuery(name = "EntradaProducto.findByIndEntradaFk", query = "SELECT e FROM EntradaProducto e WHERE e.indEntradaFk = :indEntradaFk"),
    @NamedQuery(name = "EntradaProducto.findByKilos", query = "SELECT e FROM EntradaProducto e WHERE e.kilos = :kilos"),
    @NamedQuery(name = "EntradaProducto.findByCantidad", query = "SELECT e FROM EntradaProducto e WHERE e.cantidad = :cantidad"),
    @NamedQuery(name = "EntradaProducto.findByComentarios", query = "SELECT e FROM EntradaProducto e WHERE e.comentarios = :comentarios"),
    @NamedQuery(name = "EntradaProducto.findByCosto", query = "SELECT e FROM EntradaProducto e WHERE e.costo = :costo")})
public class EntradaProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_entrada_producto_pk")
    private Integer idEntradaProductoPk;
    @Column(name = "ind_entrada_fk")
    private Integer indEntradaFk;
    @Column(name = "kilos")
    private Long kilos;
    @Column(name = "cantidad")
    private Long cantidad;
    @Column(name = "comentarios")
    private String comentarios;
    @Column(name = "costo")
    private Long costo;

    public EntradaProducto() {
    }

    public EntradaProducto(Integer idEntradaProductoPk) {
        this.idEntradaProductoPk = idEntradaProductoPk;
    }

    public Integer getIdEntradaProductoPk() {
        return idEntradaProductoPk;
    }

    public void setIdEntradaProductoPk(Integer idEntradaProductoPk) {
        this.idEntradaProductoPk = idEntradaProductoPk;
    }

    public Integer getIndEntradaFk() {
        return indEntradaFk;
    }

    public void setIndEntradaFk(Integer indEntradaFk) {
        this.indEntradaFk = indEntradaFk;
    }

    public Long getKilos() {
        return kilos;
    }

    public void setKilos(Long kilos) {
        this.kilos = kilos;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Long getCosto() {
        return costo;
    }

    public void setCosto(Long costo) {
        this.costo = costo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntradaProductoPk != null ? idEntradaProductoPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntradaProducto)) {
            return false;
        }
        EntradaProducto other = (EntradaProducto) object;
        if ((this.idEntradaProductoPk == null && other.idEntradaProductoPk != null) || (this.idEntradaProductoPk != null && !this.idEntradaProductoPk.equals(other.idEntradaProductoPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.EntradaProducto[ idEntradaProductoPk=" + idEntradaProductoPk + " ]";
    }
    
}
