/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria.service;
import Veterinaria.entily.Datos;
import Veterinaria.repository.DatosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aldav
 */
@Service
public class DatosService  implements IDatosService {
    
    @Autowired
    private DatosRepository datosRepository;
    
    @Override
    public List<Datos> getAllDatos(){
        return(List<Datos>) datosRepository.findAll();
    
    }
    @Override
    public Datos getDatosById(long id){
        return datosRepository.findById(id).orElse(null);
    
    }
    @Override
    public void saveDatos(Datos datos){
        datosRepository.save(datos);
    
    }
    @Override
    public void delete(long id){
        datosRepository.deleteById(id);
    
    }
    

    
 

    
    
    
    
  
    
    
    
}
