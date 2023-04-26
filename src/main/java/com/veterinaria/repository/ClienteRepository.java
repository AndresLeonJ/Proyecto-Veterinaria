/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.repository;
import com.veterinaria.entity.Cliente;
import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    List<Cliente> findByCedula(String cedula);

 
}

