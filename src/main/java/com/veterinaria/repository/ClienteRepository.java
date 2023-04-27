/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.repository;
import com.veterinaria.entity.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

   @Query(value = "SELECT * FROM clientes WHERE clientes.cedula LIKE %:filtro%", nativeQuery = true)
    List<Cliente> findByCedula(@Param("filtro") String filtro);
 
}

