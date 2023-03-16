/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.dnp.Repositorio;


import com.porfolio.dnp.Entidad.progreso;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface RProgreso extends JpaRepository<progreso, Integer>{
    Optional<progreso> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
