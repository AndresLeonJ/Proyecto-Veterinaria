/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria.service;

import Veterinaria.entily.FormAdoptar;
import Veterinaria.entily.FormDarAdop;

import Veterinaria.repository.FormDarAdopRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aldav
 */
@Service
public class FormDarAdopService implements IFormDarAdopService {

    @Autowired
    private FormDarAdopRepository formDarAdopRepository;
    
    @Override
    public List<FormDarAdop> getAllFormDarAdop() {
        return (List<FormDarAdop>) formDarAdopRepository.findAll();

    }

 
    @Override
    public FormDarAdop getFormDarAdopByCedula(long Cedula) {
        return formDarAdopRepository.findById(Cedula).orElse(null);

    }

   
    @Override
    public void saveFormDarAdop(FormDarAdop formDarAdoptar) {
        formDarAdopRepository.save(formDarAdoptar);

    }

    @Override
    public void delete(long Cedula) {
        formDarAdopRepository.deleteById(Cedula);

    }

  
}
