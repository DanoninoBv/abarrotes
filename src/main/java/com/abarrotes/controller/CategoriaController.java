/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.controller;

import com.abarrotes.dto.CategoriaDto;
import com.abarrotes.entidad.Categoria;
import com.abarrotes.service.CategoriaService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author world
 */
@Component
@Scope(value = "view", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CategoriaController implements Serializable {

    private static final long serialVersionUID = 1L;
    @Autowired
    private CategoriaService categoriaService;
    private List<CategoriaDto> lstcategoria;

    private CategoriaDto categoria;
     private CategoriaDto categoriaDelete;

    private String stateView = "init";

    @PostConstruct
    public void init() {
        lstcategoria = categoriaService.findAll();
        reset();
        stateView = "init";
    }

    public void search() {
        stateView = "search";
    }

    public void viewNew() {
        stateView = "new";
        categoria = new CategoriaDto();
    }

    public void back() {
        stateView = "init";
        reset();
    }

    private void reset() {
        categoria = new CategoriaDto();
    }

    public void insert() {
        System.out.println("Registro Insertado Correctamente.");
        if (categoria.getIdCategoriaPk() == null) {
            categoria.setFechaAlta(new Date());
            categoria.setEstatus('1');
            categoriaService.insert(categoria);
        } else {
            categoriaService.update(categoria);
        }
        init();
//        return "categoria";///regresamos a la pantalla
    }

    public void delete() {
        categoriaService.delete(categoriaDelete);
        init();
    }

    public String getStateView() {
        return stateView;
    }

    public void setStateView(String stateView) {
        this.stateView = stateView;
    }

    public List<CategoriaDto> getLstcategoria() {
        return lstcategoria;
    }

    public void setLstcategoria(List<CategoriaDto> lstcategoria) {
        this.lstcategoria = lstcategoria;
    }

    public CategoriaDto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDto categoria) {
        this.categoria = categoria;
    }

    public CategoriaDto getCategoriaDelete() {
        return categoriaDelete;
    }

    public void setCategoriaDelete(CategoriaDto categoriaDelete) {
        this.categoriaDelete = categoriaDelete;
    }
    
   
}
