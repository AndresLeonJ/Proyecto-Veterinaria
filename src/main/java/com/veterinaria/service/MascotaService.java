/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.service;

import com.veterinaria.entity.Mascotas;
import com.veterinaria.repository.AnimalRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService {
    @Autowired
    private AnimalRepository animalRepository;

    public List<Mascotas> getAllAnimales() {
        return (List<Mascotas>) animalRepository.findAll();
    }

    public Mascotas getAnimalById(Long idAnimal) {
        return animalRepository.findById(idAnimal).orElseThrow(() -> new RuntimeException("Animal no encontrado"));
    }

    public void saveMascota(Mascotas animal) {
        animalRepository.save(animal);
    }

    public void deleteMascota(Long idAnimal) {
        Mascotas animal = animalRepository.findById(idAnimal).orElseThrow(() -> new RuntimeException("Animal no encontrado"));
        animalRepository.delete(animal);
    }

    
}
