/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.service;

import com.veterinaria.entity.Mascotas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.veterinaria.repository.MascotaRepository;

@Service
public class MascotaService implements IMascotaService{
    @Autowired
    private MascotaRepository animalRepository;

    @Override
    public List<Mascotas> getAllAnimales() {
        return (List<Mascotas>) animalRepository.findAll();
    }

    @Override
    public Mascotas getAnimalById(long id) {
        return (Mascotas) animalRepository.findById(id);
    }

    @Override
    public void guardarMascota(Mascotas animal) {
       animalRepository.save(animal);
    }

    @Override
    public void eliminarMascota(long id) {
    animalRepository.deleteById(id);    
    }

    
}
