/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.repository;

import com.abarrotes.entidad.Proveedor;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author world
 */

@Repository
public interface ProveedorRepository extends JpaRepository <Proveedor, Integer>{
     @Override
    public List <Proveedor> findAll ();
    
    /**
     *
     * @param id
     * @param estatus
     * @return
     */
   @Modifying
   @Transactional
   @Query(value="UPDATE Proveedor SET estatus = :estatus WHERE id_provedor_pk = :id ",nativeQuery = true)
   int delete(@Param("id") Integer id, @Param("estatus") Character estatus);
}
