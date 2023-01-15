
package com.porfolio.dnp.Repositorio;

import com.porfolio.dnp.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniela
 */
@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona,Long>{
    
}
