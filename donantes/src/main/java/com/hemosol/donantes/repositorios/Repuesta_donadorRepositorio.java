package com.hemosol.donantes.repositorios;

import com.hemosol.donantes.entidades.Respuesta_donador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repuesta_donadorRepositorio extends JpaRepository<Respuesta_donador, String> {

}
