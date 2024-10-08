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
 * @author juanc
 */
@Entity
@Table(name = "venta_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VentaProducto.findAll", query = "SELECT v FROM VentaProducto v"),
    @NamedQuery(name = "VentaProducto.findByIdVentaProductoPk", query = "SELECT v FROM VentaProducto v WHERE v.idVentaProductoPk = :idVentaProductoPk"),
    @NamedQuery(name = "VentaProducto.findByIdProductoFk", query = "SELECT v FROM VentaProducto v WHERE v.idProductoFk = :idProductoFk"),
    @NamedQuery(name = "VentaProducto.findByPrecio", query = "SELECT v FROM VentaProducto v WHERE v.precio = :precio"),
    @NamedQuery(name = "VentaProducto.findByCantidad", query = "SELECT v FROM VentaProducto v WHERE v.cantidad = :cantidad"),
    @NamedQuery(name = "VentaProducto.findByCantidadAlterna", query = "SELECT v FROM VentaProducto v WHERE v.cantidadAlterna = :cantidadAlterna"),
    @NamedQuery(name = "VentaProducto.findByTotalVenta", query = "SELECT v FROM VentaProducto v WHERE v.totalVenta = :totalVenta"),
    @NamedQuery(name = "VentaProducto.findByIdVentaFk", query = "SELECT v FROM VentaProducto v WHERE v.idVentaFk = :idVentaFk"),
    @NamedQuery(name = "VentaProducto.findByCostoProducto", query = "SELECT v FROM VentaProducto v WHERE v.costoProducto = :costoProducto")})
public class VentaProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_venta_producto_pk")
    private Integer idVentaProductoPk;
    @Column(name = "id_producto_fk")
    private Integer idProductoFk;
    @Column(name = "precio")
    private Long precio;
    @Column(name = "cantidad")
    private Long cantidad;
    @Column(name = "cantidad_alterna")
    private Long cantidadAlterna;
    @Column(name = "total_venta")
    private Long totalVenta;
    @Column(name = "id_venta_fk")
    private Integer idVentaFk;
    @Column(name = "costo_producto")
    private Long costoProducto;

    public VentaProducto() {
    }

    public VentaProducto(Integer idVentaProductoPk) {
        this.idVentaProductoPk = idVentaProductoPk;
    }

    public Integer getIdVentaProductoPk() {
        return idVentaProductoPk;
    }

    public void setIdVentaProductoPk(Integer idVentaProductoPk) {
        this.idVentaProductoPk = idVentaProductoPk;
    }

    public Integer getIdProductoFk() {
        return idProductoFk;
    }

    public void setIdProductoFk(Integer idProductoFk) {
        this.idProductoFk = idProductoFk;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Long getCantidadAlterna() {
        return cantidadAlterna;
    }

    public void setCantidadAlterna(Long cantidadAlterna) {
        this.cantidadAlterna = cantidadAlterna;
    }

    public Long getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Long totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Integer getIdVentaFk() {
        return idVentaFk;
    }

    public void setIdVentaFk(Integer idVentaFk) {
        this.idVentaFk = idVentaFk;
    }

    public Long getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(Long costoProducto) {
        this.costoProducto = costoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVentaProductoPk != null ? idVentaProductoPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaProducto)) {
            return false;
        }
        VentaProducto other = (VentaProducto) object;
        if ((this.idVentaProductoPk == null && other.idVentaProductoPk != null) || (this.idVentaProductoPk != null && !this.idVentaProductoPk.equals(other.idVentaProductoPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidades.VentaProducto[ idVentaProductoPk=" + idVentaProductoPk + " ]";
    }
    
}
