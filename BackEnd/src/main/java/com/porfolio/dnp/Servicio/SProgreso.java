/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.dnp.Servicio;

import com.porfolio.dnp.Entidad.progreso;
import com.porfolio.dnp.Repositorio.RProgreso;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SProgreso {
    @Autowired
    RProgreso rprogreso;
    
    public List<progreso> list(){
        return rprogreso.findAll();
    }
    
    public Optional<progreso> getOne(int id){
        return rprogreso.findById(id);
    }
    
    public Optional<progreso> getByNombre(String nombre){
        return rprogreso.findByNombre(nombre);
    }
    
    public void save(progreso skill){
        rprogreso.save(skill);
    }
    
    public void delete(int id){
        rprogreso.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rprogreso.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rprogreso.existsByNombre(nombre);
    }
}

