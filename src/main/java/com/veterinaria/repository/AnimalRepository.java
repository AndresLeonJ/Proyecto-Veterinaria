/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.repository;

import com.veterinaria.entity.Mascotas;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface AnimalRepository  extends CrudRepository<Mascotas, Long>{
       public List<Mascotas> findById(long id);

   
    
}
