/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.service;

import com.veterinaria.entity.Reserva;
import com.veterinaria.repository.ReservaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lion
 */

@Service
public class ReservaService implements IReservaService {
    
      @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> getAllReserva() {
      return (List<Reserva>) reservaRepository.findAll();
    }

    @Override
    public List<Reserva> getReservaByCedula(String cedula) {
         return (List<Reserva>) reservaRepository.findByCedula(cedula);
    }

    @Override
    public Reserva getReservaById(long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveReserva(Reserva reserva) {
        reservaRepository.save(reserva);
    }

    @Override
    public void delete(long id) {
       reservaRepository.deleteById(id);
    }

    @Override
    public Reserva findByNombre(String username) {
        return reservaRepository.findByNombre(username);
    }
    
    
    
}

