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
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v"),
    @NamedQuery(name = "Venta.findByIdVentaPk", query = "SELECT v FROM Venta v WHERE v.idVentaPk = :idVentaPk"),
    @NamedQuery(name = "Venta.findByIdClienteFk", query = "SELECT v FROM Venta v WHERE v.idClienteFk = :idClienteFk"),
    @NamedQuery(name = "Venta.findByIdVendedorFk", query = "SELECT v FROM Venta v WHERE v.idVendedorFk = :idVendedorFk"),
    @NamedQuery(name = "Venta.findByFechaVenta", query = "SELECT v FROM Venta v WHERE v.fechaVenta = :fechaVenta"),
    @NamedQuery(name = "Venta.findByFechaPromesaPago", query = "SELECT v FROM Venta v WHERE v.fechaPromesaPago = :fechaPromesaPago"),
    @NamedQuery(name = "Venta.findByEstatusFk", query = "SELECT v FROM Venta v WHERE v.estatusFk = :estatusFk"),
    @NamedQuery(name = "Venta.findByFechaPago", query = "SELECT v FROM Venta v WHERE v.fechaPago = :fechaPago"),
    @NamedQuery(name = "Venta.findByIdSucursalFk", query = "SELECT v FROM Venta v WHERE v.idSucursalFk = :idSucursalFk"),
    @NamedQuery(name = "Venta.findByIdCajeroFk", query = "SELECT v FROM Venta v WHERE v.idCajeroFk = :idCajeroFk"),
    @NamedQuery(name = "Venta.findByIdCancelUserFk", query = "SELECT v FROM Venta v WHERE v.idCancelUserFk = :idCancelUserFk"),
    @NamedQuery(name = "Venta.findByFechaCancelacion", query = "SELECT v FROM Venta v WHERE v.fechaCancelacion = :fechaCancelacion"),
    @NamedQuery(name = "Venta.findByFechaEntrega", query = "SELECT v FROM Venta v WHERE v.fechaEntrega = :fechaEntrega"),
    @NamedQuery(name = "Venta.findByIdEntregaUserFk", query = "SELECT v FROM Venta v WHERE v.idEntregaUserFk = :idEntregaUserFk"),
    @NamedQuery(name = "Venta.findByComentariosCancel", query = "SELECT v FROM Venta v WHERE v.comentariosCancel = :comentariosCancel"),
    @NamedQuery(name = "Venta.findByFolioSucursal", query = "SELECT v FROM Venta v WHERE v.folioSucursal = :folioSucursal"),
    @NamedQuery(name = "Venta.findByTipoVenta", query = "SELECT v FROM Venta v WHERE v.tipoVenta = :tipoVenta"),
    @NamedQuery(name = "Venta.findByIdUsuariologFk", query = "SELECT v FROM Venta v WHERE v.idUsuariologFk = :idUsuariologFk"),
    @NamedQuery(name = "Venta.findByEstatusFactura", query = "SELECT v FROM Venta v WHERE v.estatusFactura = :estatusFactura"),
    @NamedQuery(name = "Venta.findByFactura", query = "SELECT v FROM Venta v WHERE v.factura = :factura")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_venta_pk")
    private Integer idVentaPk;
    @Column(name = "id_cliente_fk")
    private Integer idClienteFk;
    @Column(name = "id_vendedor_fk")
    private Integer idVendedorFk;
    @Column(name = "fecha_venta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVenta;
    @Column(name = "fecha_promesa_pago")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPromesaPago;
    @Column(name = "estatus_fk")
    private Character estatusFk;
    @Column(name = "fecha_pago")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    @Column(name = "id_sucursal_fk")
    private Integer idSucursalFk;
    @Column(name = "id_cajero_fk")
    private Integer idCajeroFk;
    @Column(name = "id_cancel_user_fk")
    private Integer idCancelUserFk;
    @Column(name = "fecha_cancelacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCancelacion;
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Column(name = "id_entrega_user_fk")
    private Integer idEntregaUserFk;
    @Column(name = "comentarios_cancel")
    private String comentariosCancel;
    @Column(name = "folio_sucursal")
    private Integer folioSucursal;
    @Column(name = "tipo_venta")
    private Character tipoVenta;
    @Column(name = "id_usuariolog_fk")
    private Integer idUsuariologFk;
    @Column(name = "estatus_factura")
    private Character estatusFactura;
    @Column(name = "factura")
    private String factura;

    public Venta() {
    }

    public Venta(Integer idVentaPk) {
        this.idVentaPk = idVentaPk;
    }

    public Integer getIdVentaPk() {
        return idVentaPk;
    }

    public void setIdVentaPk(Integer idVentaPk) {
        this.idVentaPk = idVentaPk;
    }

    public Integer getIdClienteFk() {
        return idClienteFk;
    }

    public void setIdClienteFk(Integer idClienteFk) {
        this.idClienteFk = idClienteFk;
    }

    public Integer getIdVendedorFk() {
        return idVendedorFk;
    }

    public void setIdVendedorFk(Integer idVendedorFk) {
        this.idVendedorFk = idVendedorFk;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Date getFechaPromesaPago() {
        return fechaPromesaPago;
    }

    public void setFechaPromesaPago(Date fechaPromesaPago) {
        this.fechaPromesaPago = fechaPromesaPago;
    }

    public Character getEstatusFk() {
        return estatusFk;
    }

    public void setEstatusFk(Character estatusFk) {
        this.estatusFk = estatusFk;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Integer getIdSucursalFk() {
        return idSucursalFk;
    }

    public void setIdSucursalFk(Integer idSucursalFk) {
        this.idSucursalFk = idSucursalFk;
    }

    public Integer getIdCajeroFk() {
        return idCajeroFk;
    }

    public void setIdCajeroFk(Integer idCajeroFk) {
        this.idCajeroFk = idCajeroFk;
    }

    public Integer getIdCancelUserFk() {
        return idCancelUserFk;
    }

    public void setIdCancelUserFk(Integer idCancelUserFk) {
        this.idCancelUserFk = idCancelUserFk;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getIdEntregaUserFk() {
        return idEntregaUserFk;
    }

    public void setIdEntregaUserFk(Integer idEntregaUserFk) {
        this.idEntregaUserFk = idEntregaUserFk;
    }

    public String getComentariosCancel() {
        return comentariosCancel;
    }

    public void setComentariosCancel(String comentariosCancel) {
        this.comentariosCancel = comentariosCancel;
    }

    public Integer getFolioSucursal() {
        return folioSucursal;
    }

    public void setFolioSucursal(Integer folioSucursal) {
        this.folioSucursal = folioSucursal;
    }

    public Character getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(Character tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public Integer getIdUsuariologFk() {
        return idUsuariologFk;
    }

    public void setIdUsuariologFk(Integer idUsuariologFk) {
        this.idUsuariologFk = idUsuariologFk;
    }

    public Character getEstatusFactura() {
        return estatusFactura;
    }

    public void setEstatusFactura(Character estatusFactura) {
        this.estatusFactura = estatusFactura;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVentaPk != null ? idVentaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idVentaPk == null && other.idVentaPk != null) || (this.idVentaPk != null && !this.idVentaPk.equals(other.idVentaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Venta[ idVentaPk=" + idVentaPk + " ]";
    }
    
}
