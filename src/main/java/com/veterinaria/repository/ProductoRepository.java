/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.repository;

import com.veterinaria.entity.Producto;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Lion
 */
public interface ProductoRepository  extends CrudRepository<Producto, Long>{
    @Query(value = "SELECT * FROM productos WHERE productos.id LIKE %:filtro%", nativeQuery = true)
    List<Producto> findByCedula(@Param("filtro") String filtro);

    public Producto findByMarca(String marca);
}
