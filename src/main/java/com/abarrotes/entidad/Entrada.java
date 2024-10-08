/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author world
 */
@Entity
@Table(name = "entrada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrada.findAll", query = "SELECT e FROM Entrada e"),
    @NamedQuery(name = "Entrada.findByIdEntradaPk", query = "SELECT e FROM Entrada e WHERE e.idEntradaPk = :idEntradaPk"),
    @NamedQuery(name = "Entrada.findByIdProveedorFk", query = "SELECT e FROM Entrada e WHERE e.idProveedorFk = :idProveedorFk"),
    @NamedQuery(name = "Entrada.findByMovimiento", query = "SELECT e FROM Entrada e WHERE e.movimiento = :movimiento"),
    @NamedQuery(name = "Entrada.findByFecha", query = "SELECT e FROM Entrada e WHERE e.fecha = :fecha"),
    @NamedQuery(name = "Entrada.findByRemision", query = "SELECT e FROM Entrada e WHERE e.remision = :remision"),
    @NamedQuery(name = "Entrada.findByEstatus", query = "SELECT e FROM Entrada e WHERE e.estatus = :estatus"),
    @NamedQuery(name = "Entrada.findByKilosTotales", query = "SELECT e FROM Entrada e WHERE e.kilosTotales = :kilosTotales"),
    @NamedQuery(name = "Entrada.findByCantidadesTotales", query = "SELECT e FROM Entrada e WHERE e.cantidadesTotales = :cantidadesTotales"),
    @NamedQuery(name = "Entrada.findByComentarios", query = "SELECT e FROM Entrada e WHERE e.comentarios = :comentarios"),
    @NamedQuery(name = "Entrada.findByFechaRemision", query = "SELECT e FROM Entrada e WHERE e.fechaRemision = :fechaRemision"),
    @NamedQuery(name = "Entrada.findByFechaPago", query = "SELECT e FROM Entrada e WHERE e.fechaPago = :fechaPago"),
    @NamedQuery(name = "Entrada.findByIdUsuarioFk", query = "SELECT e FROM Entrada e WHERE e.idUsuarioFk = :idUsuarioFk"),
    @NamedQuery(name = "Entrada.findByUrlImagen", query = "SELECT e FROM Entrada e WHERE e.urlImagen = :urlImagen"),
    @NamedQuery(name = "Entrada.findByFechaCancelacion", query = "SELECT e FROM Entrada e WHERE e.fechaCancelacion = :fechaCancelacion"),
    @NamedQuery(name = "Entrada.findByIdUsuarioCancelacionFk", query = "SELECT e FROM Entrada e WHERE e.idUsuarioCancelacionFk = :idUsuarioCancelacionFk"),
    @NamedQuery(name = "Entrada.findByFactura", query = "SELECT e FROM Entrada e WHERE e.factura = :factura"),
    @NamedQuery(name = "Entrada.findByNumeroFactura", query = "SELECT e FROM Entrada e WHERE e.numeroFactura = :numeroFactura")})
public class Entrada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_entrada_pk")
    private Integer idEntradaPk;
    @Column(name = "id_proveedor_fk")
    private Integer idProveedorFk;
    @Column(name = "movimiento")
    private Integer movimiento;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "remision")
    private String remision;
    @Column(name = "estatus")
    private Character estatus;
    @Column(name = "kilos_totales")
    private Long kilosTotales;
    @Column(name = "cantidades_totales")
    private Long cantidadesTotales;
    @Column(name = "comentarios")
    private String comentarios;
    @Column(name = "fecha_remision")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRemision;
    @Column(name = "fecha_pago")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    @Column(name = "id_usuario_fk")
    private Integer idUsuarioFk;
    @Column(name = "url_imagen")
    private String urlImagen;
    @Column(name = "fecha_cancelacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCancelacion;
    @Column(name = "id_usuario_cancelacion_fk")
    private Integer idUsuarioCancelacionFk;
    @Column(name = "factura")
    private Character factura;
    @Column(name = "numero_factura")
    private String numeroFactura;

    public Entrada() {
    }

    public Entrada(Integer idEntradaPk) {
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
        if (!(object instanceof Entrada)) {
            return false;
        }
        Entrada other = (Entrada) object;
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
