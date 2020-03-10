

package com.hemosol.donantes.repositorios;

import com.hemosol.donantes.entidades.Zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ZonaRepositorio extends JpaRepository<Zona, String> {
    
}
