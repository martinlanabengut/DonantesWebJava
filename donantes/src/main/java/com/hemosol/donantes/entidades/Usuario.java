package com.hemosol.donantes.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private String apellido;
    private String mail;
    private String clave;
    private String grupo_sanguineo;
    private String zona;
    
    private int edad;
    private int peso;

   // @Temporal(TemporalType.TIMESTAMP)
   // private Date ultima_donacion;
   // @Temporal(TemporalType.TIMESTAMP)
//    private Date ultimo_tatuaje;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date ultimo_piercing;
   private String medicacion;
  private String alergias;
 private String antecedentes;

   // private boolean puede_donar;

    
    
    
    @Temporal(TemporalType.TIMESTAMP)//Al framework de persistencia hay que decirle de que manera se va a almacenar esa fecha en la base de datos, usamos temporal, que tiene 3 formas
    private Date alta;

  
	


	@Temporal(TemporalType.TIMESTAMP)
    private Date baja;





	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getApellido() {
		return apellido;
	}





	public void setApellido(String apellido) {
		this.apellido = apellido;
	}





	public String getMail() {
		return mail;
	}





	public void setMail(String mail) {
		this.mail = mail;
	}





	public String getClave() {
		return clave;
	}





	public void setClave(String clave) {
		this.clave = clave;
	}





	public String getGrupo_sanguineo() {
		return grupo_sanguineo;
	}





	public void setGrupo_sanguineo(String grupo_sanguineo) {
		this.grupo_sanguineo = grupo_sanguineo;
	}





	public String getZona() {
		return zona;
	}





	public void setZona(String zona) {
		this.zona = zona;
	}





	public int getEdad() {
		return edad;
	}





	public void setEdad(int edad) {
		this.edad = edad;
	}





	public int getPeso() {
		return peso;
	}





	public void setPeso(int peso) {
		this.peso = peso;
	}





	public Date getAlta() {
		return alta;
	}





	public void setAlta(Date alta) {
		this.alta = alta;
	}





	public Date getBaja() {
		return baja;
	}





	public void setBaja(Date baja) {
		this.baja = baja;
	}





	public String getMedicacion() {
		return medicacion;
	}





	public void setMedicacion(String medicacion) {
		this.medicacion = medicacion;
	}





	public String getAlergias() {
		return alergias;
	}





	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}





	public String getAntecedentes() {
		return antecedentes;
	}





	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}
	
	
	

}

//    @ManyToOne   //El usuario pertenece a una zona, pero la zona puede contener muchos usuarios. Entonces, desde el punto de vista del usuario, esta relacion es una @manytoone(muchos usuarios para una zona)
//    private Zona zona;  //Esto es una relacion. La ponemos aca porque es el usuario quien tiene una zona, y no la zona que tiene un usuario
//
//    @OneToOne
//    private Requisitos requisitos;
////     @OneToMany//Un usuario puede tener muchas solicitudes, ya que estan llegan segun coincide su grupo sanguineo
////      private Solicitud solicitud;
//     

//     @OneToOne
//     private Pedido pedido;
    
    
    
    
   