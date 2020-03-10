package com.hemosol.donantes.controladores;

import com.hemosol.donantes.entidades.Zona;
import com.hemosol.donantes.errores.ErrorServicio;
import com.hemosol.donantes.repositorios.ZonaRepositorio;
import com.hemosol.donantes.servicios.UsuarioServicio;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class PortalControlador {

	@Autowired
	private UsuarioServicio usuarioServicio;

	@Autowired
	private ZonaRepositorio zonaRepositorio;

	@GetMapping("/")
	public String index() {
		return "index.html";
	}

	@PreAuthorize("hasAnyRole('ROLE_USUARIO_REGISTRADO')")
	@GetMapping("/index")
	public String inicio() {
		return "index.html";
	}

	@GetMapping("/registro")
	public String registro() {
		return "registro.html";
	}
//   @GetMapping("/login")
//   public String login() {
//       return "login.html";
//  }

	@GetMapping("/login")
	public String login(@RequestParam(required = false) String error, @RequestParam(required = false) String logout,
			ModelMap model) {
		if (error != null) {
			model.put("error", "Nombre de usuario o clave incorrectos.");
		}

		if (logout != null) {
			model.put("logout", "Ha salido correctamente de la plataforma.");
		}

		return "login.html";
	}

	@PreAuthorize("hasAnyRole('ROLE_USUARIO_REGISTRADO')")
	@GetMapping("/pedido")
	public String pedido() {
		return "pedido.html";
	}

	@GetMapping("/estadisticas")
	public String estadisticas() {
		return "estadisticas.html";
	}

	@GetMapping("/pregFrecuentes")
	public String pregFrecuentes() {
		return "pregFrecuentes.html";
	}

	@PostMapping("/registrar")
	public String registrar(ModelMap modelo, String nombre, String apellido, String mail, String clave,
			String grupo_sanguineo, String zona, String edad, String peso, String medicacion, String alergias,
			String antecedentes) {
		
		try {
			System.out.println(nombre + apellido + mail + clave + grupo_sanguineo + zona + Integer.parseInt(edad)
					+ Integer.parseInt(peso) + medicacion + alergias + antecedentes);
			usuarioServicio.registrar(nombre, apellido, mail, clave, grupo_sanguineo, zona, Integer.parseInt(edad),
					Integer.parseInt(peso), medicacion, alergias, antecedentes);
		} catch (ErrorServicio ex) {

           modelo.put("error", ex.getMessage());
           modelo.put("nombre", nombre);
           modelo.put("apellido", apellido);
           modelo.put("mail", mail);
           modelo.put("clave", clave);
           modelo.put("grupo_sanguineo", grupo_sanguineo);
           
			return "registro.html";

		}
		return "index.html";
	}
}


 

   

