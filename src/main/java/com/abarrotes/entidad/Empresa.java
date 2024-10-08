/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.entidad;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author world
 */
@Entity
@Table(name = "empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e"),
    @NamedQuery(name = "Empresa.findByIdEmpresaPk", query = "SELECT e FROM Empresa e WHERE e.idEmpresaPk = :idEmpresaPk"),
    @NamedQuery(name = "Empresa.findByNombre", query = "SELECT e FROM Empresa e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empresa.findByCorreo", query = "SELECT e FROM Empresa e WHERE e.correo = :correo"),
    @NamedQuery(name = "Empresa.findByTelefono", query = "SELECT e FROM Empresa e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Empresa.findByDireccion", query = "SELECT e FROM Empresa e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "Empresa.findByNumeroDeUsuarios", query = "SELECT e FROM Empresa e WHERE e.numeroDeUsuarios = :numeroDeUsuarios"),
    @NamedQuery(name = "Empresa.findByNombreComercial", query = "SELECT e FROM Empresa e WHERE e.nombreComercial = :nombreComercial"),
    @NamedQuery(name = "Empresa.findByLogo", query = "SELECT e FROM Empresa e WHERE e.logo = :logo"),
    @NamedQuery(name = "Empresa.findByRepresentanteLegal", query = "SELECT e FROM Empresa e WHERE e.representanteLegal = :representanteLegal"),
    @NamedQuery(name = "Empresa.findByEnvioDeMensajes", query = "SELECT e FROM Empresa e WHERE e.envioDeMensajes = :envioDeMensajes"),
    @NamedQuery(name = "Empresa.findByPasswordCorreo", query = "SELECT e FROM Empresa e WHERE e.passwordCorreo = :passwordCorreo"),
    @NamedQuery(name = "Empresa.findByUsuarioCorreo", query = "SELECT e FROM Empresa e WHERE e.usuarioCorreo = :usuarioCorreo"),
    @NamedQuery(name = "Empresa.findByHost", query = "SELECT e FROM Empresa e WHERE e.host = :host"),
    @NamedQuery(name = "Empresa.findByPuerto", query = "SELECT e FROM Empresa e WHERE e.puerto = :puerto"),
    @NamedQuery(name = "Empresa.findByToken", query = "SELECT e FROM Empresa e WHERE e.token = :token"),
    @NamedQuery(name = "Empresa.findByInstancia", query = "SELECT e FROM Empresa e WHERE e.instancia = :instancia"),
    @NamedQuery(name = "Empresa.findByEstatus", query = "SELECT e FROM Empresa e WHERE e.estatus = :estatus")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_empresa_pk")
    private Integer idEmpresaPk;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "numero_de_usuarios")
    private BigInteger numeroDeUsuarios;
    @Column(name = "nombre_comercial")
    private String nombreComercial;
    @Column(name = "logo")
    private String logo;
    @Column(name = "representante_legal")
    private String representanteLegal;
    @Column(name = "envio_de_mensajes")
    private Character envioDeMensajes;
    @Column(name = "password_correo")
    private String passwordCorreo;
    @Column(name = "usuario_correo")
    private String usuarioCorreo;
    @Column(name = "host")
    private String host;
    @Column(name = "puerto")
    private String puerto;
    @Column(name = "token")
    private String token;
    @Column(name = "instancia")
    private String instancia;
    @Column(name = "estatus")
    private Character estatus;
    @OneToMany(mappedBy = "idEmpresaFk")
    private List<Sucursal> sucursalList;

    public Empresa() {
    }

    public Empresa(Integer idEmpresaPk) {
        this.idEmpresaPk = idEmpresaPk;
    }

    public Integer getIdEmpresaPk() {
        return idEmpresaPk;
    }

    public void setIdEmpresaPk(Integer idEmpresaPk) {
        this.idEmpresaPk = idEmpresaPk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigInteger getNumeroDeUsuarios() {
        return numeroDeUsuarios;
    }

    public void setNumeroDeUsuarios(BigInteger numeroDeUsuarios) {
        this.numeroDeUsuarios = numeroDeUsuarios;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public Character getEnvioDeMensajes() {
        return envioDeMensajes;
    }

    public void setEnvioDeMensajes(Character envioDeMensajes) {
        this.envioDeMensajes = envioDeMensajes;
    }

    public String getPasswordCorreo() {
        return passwordCorreo;
    }

    public void setPasswordCorreo(String passwordCorreo) {
        this.passwordCorreo = passwordCorreo;
    }

    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public Character getEstatus() {
        return estatus;
    }

    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }

    @XmlTransient
    public List<Sucursal> getSucursalList() {
        return sucursalList;
    }

    public void setSucursalList(List<Sucursal> sucursalList) {
        this.sucursalList = sucursalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresaPk != null ? idEmpresaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.idEmpresaPk == null && other.idEmpresaPk != null) || (this.idEmpresaPk != null && !this.idEmpresaPk.equals(other.idEmpresaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Empresa[ idEmpresaPk=" + idEmpresaPk + " ]";
    }
    
}
