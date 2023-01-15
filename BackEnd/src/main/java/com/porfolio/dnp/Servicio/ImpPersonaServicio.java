
package com.porfolio.dnp.Servicio;

import com.porfolio.dnp.Entidad.Persona;
import com.porfolio.dnp.Interface.IPersonaServicio;
import com.porfolio.dnp.Repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Daniela
 */
@Service
public class ImpPersonaServicio implements IPersonaServicio{

    @Autowired IPersonaRepositorio ipersonaRepositorio;
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepositorio.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepositorio.save(persona);
   }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepositorio.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepositorio.findById(id).orElse(null);
        return persona;
    
    }
    
}
