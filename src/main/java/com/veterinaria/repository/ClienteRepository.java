/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.repository;
import com.veterinaria.entity.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Lion
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    //La primera línea de código se utiliza para hacerle una consulta a la 
    //base de datos en donde cometa la funcion de encontrar la cedula que se digito
              
////Lo mismo que la primera linea de codigo solo que ahora para encopntrar al cliente por medio de su cedula 

//Y la tercera lo mismo solo que ahora para buscarlos por su nombre 
    @Query(value = "SELECT * FROM Cliente WHERE Cliente.cedula LIKE %:filtro%", nativeQuery = true)
    List<Cliente> findByCedula(@Param("filtro") String filtro);

    Cliente findByNombre(String nombre);
}

