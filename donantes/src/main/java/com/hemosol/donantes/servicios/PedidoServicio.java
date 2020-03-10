package com.hemosol.donantes.servicios;

import com.hemosol.donantes.entidades.Pedido;
import com.hemosol.donantes.repositorios.PedidoRepositorio;
import com.hemosol.donantes.repositorios.UsuarioRepositorio;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServicio {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Autowired
	private PedidoRepositorio pedidoRepositorio;
    
//    public void pedirDonantes(String idUsuario, String nombre_del_necesitado, String apellido_del_necesitado,String grupo_sanguineo, String cantidad_de_donantes_neccesitados,String centro_de_salud,String horarios_de_donacion) {
//        
//        Pedido pedido = new Pedido();
//        pedido.setFecha_alta(new Date());
//        
//        pedidoRepositorio.save(pedido);
//        
//                
//        
//    }
    
   
//    public void responderPedido(String idUsuario, String idPedido){
//        
//         Optional<Pedido> respuesta = pedidoRepositorio.findById(idPedido);
//        if(respuesta.isPresent()){ //validamos si el pedido existe
//            Pedido pedido = respuesta.get();
//            pedido.setRespuesta(new Date());
//            
//            if(pedido.getRespuesta() == "Acepto" //revisar esto, como hacerlo?
//               
//                pedidoRepositorio.save(pedido);
//        
//        
//    }
//    }
}

    
    
    
    


      
    
 
    
    
    
    
    
    
    
    

