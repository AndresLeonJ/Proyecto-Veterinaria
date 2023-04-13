/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.service;

import com.veterinaria.entity.Reserva;
import java.util.List;

/**
 *
 * @author Lion
 */
public interface IReservaService {
     public List<Reserva> getAllReserva();
    public List<Reserva> getReservaByCedula(String cedula);
    public Reserva getReservaById (long id);
    public void saveReserva(Reserva reserva);
    public void delete (long id);
    public Reserva findByNombre (String username);
}
