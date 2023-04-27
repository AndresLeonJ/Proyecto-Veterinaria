/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria.repository;

import Veterinaria.entily.FormDarAdop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aldav
 */
@Repository
/* Definimos que tipo de clase o como se va a conportar*/
public interface FormDarAdopRepository extends CrudRepository<FormDarAdop,Long> {
    
}
