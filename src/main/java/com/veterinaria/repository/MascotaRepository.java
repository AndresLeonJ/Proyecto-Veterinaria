
package com.veterinaria.repository;

import com.veterinaria.entity.Mascotas;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MascotaRepository extends CrudRepository<Mascotas, Long>{
       public List<Mascotas> findById(long id);
       
}
