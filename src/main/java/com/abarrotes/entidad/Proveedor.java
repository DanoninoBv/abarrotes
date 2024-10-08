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
@Table(name = "proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p"),
    @NamedQuery(name = "Proveedor.findByIdProvedorPk", query = "SELECT p FROM Proveedor p WHERE p.idProvedorPk = :idProvedorPk"),
    @NamedQuery(name = "Proveedor.findByNombre", query = "SELECT p FROM Proveedor p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Proveedor.findByEmpresa", query = "SELECT p FROM Proveedor p WHERE p.empresa = :empresa"),
    @NamedQuery(name = "Proveedor.findByDireccion", query = "SELECT p FROM Proveedor p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Proveedor.findBySexo", query = "SELECT p FROM Proveedor p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "Proveedor.findByFechaNacimiento", query = "SELECT p FROM Proveedor p WHERE p.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Proveedor.findByTelefono", query = "SELECT p FROM Proveedor p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Proveedor.findByCp", query = "SELECT p FROM Proveedor p WHERE p.cp = :cp"),
    @NamedQuery(name = "Proveedor.findByRfcProve", query = "SELECT p FROM Proveedor p WHERE p.rfcProve = :rfcProve"),
    @NamedQuery(name = "Proveedor.findByEstatus", query = "SELECT p FROM Proveedor p WHERE p.estatus = :estatus"),
    @NamedQuery(name = "Proveedor.findByFechaAlta", query = "SELECT p FROM Proveedor p WHERE p.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "Proveedor.findByNombreCorto", query = "SELECT p FROM Proveedor p WHERE p.nombreCorto = :nombreCorto"),
    @NamedQuery(name = "Proveedor.findByCorreo", query = "SELECT p FROM Proveedor p WHERE p.correo = :correo"),
    @NamedQuery(name = "Proveedor.findByPais", query = "SELECT p FROM Proveedor p WHERE p.pais = :pais")})
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_provedor_pk")
    private Integer idProvedorPk;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "cp")
    private String cp;
    @Column(name = "rfc_prove")
    private String rfcProve;
    @Column(name = "estatus")
    private String estatus;
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "nombre_corto")
    private String nombreCorto;
    @Column(name = "correo")
    private String correo;
    @Column(name = "pais")
    private String pais;

    public Proveedor() {
    }

    public Proveedor(Integer idProvedorPk) {
        this.idProvedorPk = idProvedorPk;
    }

    public Integer getIdProvedorPk() {
        return idProvedorPk;
    }

    public void setIdProvedorPk(Integer idProvedorPk) {
        this.idProvedorPk = idProvedorPk;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getRfcProve() {
        return rfcProve;
    }

    public void setRfcProve(String rfcProve) {
        this.rfcProve = rfcProve;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProvedorPk != null ? idProvedorPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.idProvedorPk == null && other.idProvedorPk != null) || (this.idProvedorPk != null && !this.idProvedorPk.equals(other.idProvedorPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Proveedor[ idProvedorPk=" + idProvedorPk + " ]";
    }
    
}
