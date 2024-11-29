
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
    @Query(value="UPDATE Sucursal SET estatus = :estatus WHERE id_sucursal_pk = :id ",nativeQuery=true)
    int delete(@Param("id") Integer id, @Param("estatus") Character estatus);
    
    @Modifying
    @Transactional
    @Query(value="SELECT * FROM  Sucursal  where id_empresa_fk=:idEmpresaFk ",nativeQuery=true)
    public List<Object[]> busca( @Param("idEmpresaFk") Integer idEmpresaFk );   
}
