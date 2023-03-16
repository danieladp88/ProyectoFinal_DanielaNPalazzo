
package com.porfolio.dnp.Repositorio;

import com.porfolio.dnp.Entidad.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona, Integer> {
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
