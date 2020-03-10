package com.hemosol.donantes.repositorios;

import com.hemosol.donantes.entidades.Pedido;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, String> {

//    @Query("SELECT c FROM Pedido c WHERE c.usuruario.id = :id ORDER BY c.fecha DESC")
//    public List<Pedido> buscarPedidos(@Param("id") String id);

}
