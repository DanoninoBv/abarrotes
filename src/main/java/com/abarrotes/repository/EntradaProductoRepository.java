/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.repository;

import com.abarrotes.entidad.EntradaProducto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author world
 */

@Repository

public interface EntradaProductoRepository extends JpaRepository <EntradaProducto, Integer>{
    @Override
    public List <EntradaProducto> findAll ();
}
