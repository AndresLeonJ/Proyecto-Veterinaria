/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria.service;

import Veterinaria.entily.FormAdoptar;
import java.util.List;

/**
 *
 * @author aldav
 */
public interface IFormAdoptarService {
  
    public List<FormAdoptar> listform();
    
    public List<FormAdoptar> getAllFormAdoptar();

    public FormAdoptar getFormAdoptarById(long id);

    public void saveFormAdoptar(FormAdoptar formAdoptar);

    public void delete(long id);
    
    public FormAdoptar findByNombre(String username);

    
    
}
