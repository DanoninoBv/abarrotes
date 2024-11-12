/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.controller;

import com.abarrotes.dto.EmpresaDto;
import com.abarrotes.dto.UsuarioDto;
import com.abarrotes.service.EmpresaService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 *
 * @author world
 */
@Component
@Scope(value = "view", proxyMode = ScopedProxyMode.TARGET_CLASS)

public class EmpresaController implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    private InfoUsuarioController infoUsuario;
    @Autowired
    private EmpresaService empresaService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    private List<EmpresaDto> lstempresa;

    private EmpresaDto empresa;
    private EmpresaDto empresaDelete;

    private String stateView = "init";

    private UsuarioDto usuario;
    private EmpresaDto empresaDatos;

    @PostConstruct
    public void init() {
        usuario = infoUsuario.getUsuario();
        System.out.println("usuario " + usuario.toString());
        empresaDatos = empresaService.findByIdUsuario(usuario.getIdUsuarioPk());
        System.out.println("empresa " + empresaDatos.toString());
        lstempresa = empresaService.findAllNativo();

        reset();
        stateView = "init";
    }

    public void search() {
        stateView = "search";
    }

    public void viewNew() {
        stateView = "new";
        empresa = new EmpresaDto();
    }

    public void back() {
        stateView = "init";
        reset();
    }

    private void reset() {
        empresa = new EmpresaDto();
    }

    // Otros métodos y variables
    public void insert() {
        System.out.println("Registro Insertado Correctamente.");
        if (empresa.getIdEmpresaPk() == null) {
            empresa.setEstatus('1');
            empresaService.insert(empresa);
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Guardado", "Registro insertado correctamente"));
        } else {
            empresaService.update(empresa);
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Nuevo", "Nuevo registro"));
        }
        init();
    }

    public void delete() {
        empresaDelete.setEstatus('0');
        empresaService.delete(empresaDelete);
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Eliminar", "Registro eliminado"));
        init();
    }

    public String getStateView() {
        return stateView;
    }

    public void setStateView(String stateView) {
        this.stateView = stateView;
    }

    public List<EmpresaDto> getLstempresa() {
        return lstempresa;
    }

    public void setLstcategoria(List<EmpresaDto> lstempresa) {
        this.lstempresa = lstempresa;
    }

    public EmpresaDto getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaDto usuario) {
        this.empresa = usuario;
    }

    public EmpresaDto getEmpresaoDelete() {
        return empresaDelete;
    }

    public void setEmpresaDelete(EmpresaDto empresaDelete) {
        this.empresaDelete = empresaDelete;
    }

}
