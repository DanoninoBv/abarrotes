
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.repository;

import com.abarrotes.entidad.Sucursal;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/* @author world*/

@Repository
public interface SucursalRepository extends JpaRepository <Sucursal, Integer>{
    @Override
    public List<Sucursal> findAll(); 
    
    @Modifying
    @Transactional
    @Query("UPDATE Bodega SET estatus = :estatus WHERE id_bodega_pk = :id")
    int delete(@Param("id") Integer id, @Param("estatus") Character estatus);
    
    @Transactional
    @Query("SELECT b FROM  Sucursal b where campo=:idEmpresaFk ")
    public List<Sucursal> busca( @Param("idEmpresaFk") Integer idEmpresaFk );   
}
