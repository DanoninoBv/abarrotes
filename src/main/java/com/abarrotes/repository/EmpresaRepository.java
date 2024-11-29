/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abarrotes.entidad.Empresa;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author world
 */
@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

    @Query(value = "SELECT * FROM EMPRESA ", nativeQuery = true)
    List<Empresa> findAllNativo();

    @Query(value = "SELECT E.* FROM EMPRESA E "
            + "LEFT JOIN SUCURSAL S ON E.ID_EMPRESA_PK = S.ID_EMPRESA_FK "
            + "LEFT JOIN USUARIO U ON U.ID_SUCURSAL_FK = S.ID_SUCURSAL_PK "
            + "WHERE U.ID_USUARIO_PK =:idUsuario", nativeQuery = true)
    List<Object[]> findByIdUsuario(@Param("idUsuario") Integer idUsuario);

}
