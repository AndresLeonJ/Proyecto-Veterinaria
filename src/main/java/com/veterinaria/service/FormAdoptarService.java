/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.service;
import com.veterinaria.entity.FormAdoptar;
import com.veterinaria.repository.FormAdoptarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aldav
 */
@Service
public class FormAdoptarService implements IFormAdoptarService {

    @Autowired
    /*Hcae la union del server y el repository es para unir objetos*/

    private FormAdoptarRepository formadoptarRepository;

    /*Aqui sobre escribimos los metodos*/
    
    @Override
    public List<FormAdoptar> getAllFormAdoptar() {
        return (List<FormAdoptar>) formadoptarRepository.findAll();

    }
    
     @Override
    /*Aqui sobre escribimos los metodos*/
    public List<FormAdoptar> listform() {
        return(List<FormAdoptar>) formadoptarRepository.findAll();
        
        
    }

   

    @Override
    public FormAdoptar getFormAdoptarById(long id) {
        return formadoptarRepository.findById(id).orElse(null);

    }

    @Override
    public void saveFormAdoptar(FormAdoptar formAdoptar) {
        formadoptarRepository.save(formAdoptar);

    }

    @Override
    public void delete(long id) {
        formadoptarRepository.deleteById(id);

    }

    @Override
    public FormAdoptar findByNombre(String username) {
        return formadoptarRepository.findByNombre(username);

    }


   
}
