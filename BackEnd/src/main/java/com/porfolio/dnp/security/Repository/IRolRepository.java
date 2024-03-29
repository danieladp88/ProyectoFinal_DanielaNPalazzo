
package com.porfolio.dnp.Security.Repository;

import com.porfolio.dnp.security.Entity.Rol;
import com.porfolio.dnp.security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

