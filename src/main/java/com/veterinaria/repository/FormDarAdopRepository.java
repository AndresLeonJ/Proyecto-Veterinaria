package com.veterinaria.repository;

import com.veterinaria.entity.FormDarAdop;
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
