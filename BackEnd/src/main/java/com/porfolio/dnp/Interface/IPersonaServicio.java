
package com.porfolio.dnp.Interface;

import com.porfolio.dnp.Entidad.Persona;
import java.util.List;

/**
 *
 * @author Daniela
 */
public interface IPersonaServicio {

    //Traer una lista de personas
    public List<Persona> getPersona();

    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona); 
        //Eliminar un usuario
    public void deletePersona(Long id);

    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
