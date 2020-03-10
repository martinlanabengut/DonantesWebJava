
package com.hemosol.donantes.repositorios;

import com.hemosol.donantes.entidades.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosRepositorio extends JpaRepository<Datos,String> {
    
    
}
