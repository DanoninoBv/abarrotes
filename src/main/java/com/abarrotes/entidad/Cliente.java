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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdClientePk", query = "SELECT c FROM Cliente c WHERE c.idClientePk = :idClientePk"),
    @NamedQuery(name = "Cliente.findByNombre", query = "SELECT c FROM Cliente c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Cliente.findByEmpresa", query = "SELECT c FROM Cliente c WHERE c.empresa = :empresa"),
    @NamedQuery(name = "Cliente.findBySexo", query = "SELECT c FROM Cliente c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "Cliente.findByTelefonoCelular", query = "SELECT c FROM Cliente c WHERE c.telefonoCelular = :telefonoCelular"),
    @NamedQuery(name = "Cliente.findByTelefonoFijo", query = "SELECT c FROM Cliente c WHERE c.telefonoFijo = :telefonoFijo"),
    @NamedQuery(name = "Cliente.findByRfc", query = "SELECT c FROM Cliente c WHERE c.rfc = :rfc"),
    @NamedQuery(name = "Cliente.findByEstatus", query = "SELECT c FROM Cliente c WHERE c.estatus = :estatus"),
    @NamedQuery(name = "Cliente.findByFechaAlta", query = "SELECT c FROM Cliente c WHERE c.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "Cliente.findByIdUsuarioFk", query = "SELECT c FROM Cliente c WHERE c.idUsuarioFk = :idUsuarioFk"),
    @NamedQuery(name = "Cliente.findByDiasCredito", query = "SELECT c FROM Cliente c WHERE c.diasCredito = :diasCredito"),
    @NamedQuery(name = "Cliente.findByMontoCredito", query = "SELECT c FROM Cliente c WHERE c.montoCredito = :montoCredito"),
    @NamedQuery(name = "Cliente.findByTipoPersona", query = "SELECT c FROM Cliente c WHERE c.tipoPersona = :tipoPersona"),
    @NamedQuery(name = "Cliente.findByCp", query = "SELECT c FROM Cliente c WHERE c.cp = :cp"),
    @NamedQuery(name = "Cliente.findByDireccion", query = "SELECT c FROM Cliente c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Cliente.findByPais", query = "SELECT c FROM Cliente c WHERE c.pais = :pais"),
    @NamedQuery(name = "Cliente.findByCorreo", query = "SELECT c FROM Cliente c WHERE c.correo = :correo"),
    @NamedQuery(name = "Cliente.findByIdEmpresaFk", query = "SELECT c FROM Cliente c WHERE c.idEmpresaFk = :idEmpresaFk"),
    @NamedQuery(name = "Cliente.findByFormaPago", query = "SELECT c FROM Cliente c WHERE c.formaPago = :formaPago"),
    @NamedQuery(name = "Cliente.findByMetodoPago", query = "SELECT c FROM Cliente c WHERE c.metodoPago = :metodoPago"),
    @NamedQuery(name = "Cliente.findByRegimen", query = "SELECT c FROM Cliente c WHERE c.regimen = :regimen"),
    @NamedQuery(name = "Cliente.findByIdVendedorFk", query = "SELECT c FROM Cliente c WHERE c.idVendedorFk = :idVendedorFk"),
    @NamedQuery(name = "Cliente.findByMandarMebsajePromocion", query = "SELECT c FROM Cliente c WHERE c.mandarMebsajePromocion = :mandarMebsajePromocion")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente_pk")
    private Integer idClientePk;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "telefono_celular")
    private String telefonoCelular;
    @Column(name = "telefono_fijo")
    private String telefonoFijo;
    @Column(name = "rfc")
    private String rfc;
    @Column(name = "estatus")
    private Character estatus;
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "id_usuario_fk")
    private Integer idUsuarioFk;
    @Column(name = "dias_credito")
    private Long diasCredito;
    @Column(name = "monto_credito")
    private Long montoCredito;
    @Column(name = "tipo_persona")
    private Character tipoPersona;
    @Column(name = "cp")
    private String cp;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "pais")
    private String pais;
    @Column(name = "correo")
    private String correo;
    @Column(name = "id_empresa_fk")
    private Integer idEmpresaFk;
    @Column(name = "forma_pago")
    private String formaPago;
    @Column(name = "metodo_pago")
    private String metodoPago;
    @Column(name = "regimen")
    private String regimen;
    @Column(name = "id_vendedor_fk")
    private Integer idVendedorFk;
    @Column(name = "mandar_mebsaje_promocion")
    private Integer mandarMebsajePromocion;

    public Cliente() {
    }

    public Cliente(Integer idClientePk) {
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        return !((this.idClientePk == null && other.idClientePk != null) || (this.idClientePk != null && !this.idClientePk.equals(other.idClientePk)));
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Cliente[ idClientePk=" + idClientePk + " ]";
    }
    
}
