package com.hemosol.donantes.entidades;
//
//import java.util.Date;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import org.hibernate.annotations.GenericGenerator;
//
//@Entity
//public class Requisitos {
//
//    @Id
//    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy = "uuid2")
//    private String id_requisitos;
//    private int edad;
//    private int peso;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date ultima_donacion;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date ultimo_tatuaje;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date ultimo_piercing;
//    private String medicacion;
//    private String alergias;
//    private String antecedentes;
//
//    
//    
// 
//		super();
//		this.id_requisitos = id_requisitos;
//		this.edad = edad;
//		this.peso = peso;
//		this.ultima_donacion = ultima_donacion;
//		this.ultimo_tatuaje = ultimo_tatuaje;
//		this.ultimo_piercing = ultimo_piercing;
//		this.medicacion = medicacion;
//		this.alergias = alergias;
//		this.antecedentes = antecedentes;
//	}
//
//	public String getId_requisitos() {
//        return id_requisitos;
//    }
//
//    public void setId_requisitos(String id_requisitos) {
//        this.id_requisitos = id_requisitos;
//    }
//
//    public int getEdad() {
//        return edad;
//    }
//
//    public void setEdad(int edad) {
//        this.edad = edad;
//    }
//
//    public int getPeso() {
//        return peso;
//    }
//
//    public void setPeso(int peso) {
//        this.peso = peso;
//    }
//
//    public Date getUltima_donacion() {
//        return ultima_donacion;
//    }
//
//    public void setUltima_donacion(Date ultima_donacion) {
//        this.ultima_donacion = ultima_donacion;
//    }
//
//    public Date getUltimo_tatuaje() {
//        return ultimo_tatuaje;
//    }
//
//    public void setUltimo_tatuaje(Date ultimo_tatuaje) {
//        this.ultimo_tatuaje = ultimo_tatuaje;
//    }
//
//    public Date getUltimo_piercing() {
//        return ultimo_piercing;
//    }
//
//    public void setUltimo_piercing(Date ultimo_piercing) {
//        this.ultimo_piercing = ultimo_piercing;
//    }
//
//    public String getMedicacion() {
//        return medicacion;
//    }
//
//    public void setMedicacion(String medicacion) {
//        this.medicacion = medicacion;
//    }
//
//    public String getAlergias() {
//        return alergias;
//    }
//
//    public void setAlergias(String alergias) {
//        this.alergias = alergias;
//    }
//
//    public String getAntecedentes() {
//        return antecedentes;
//    }
//
//    public void setAntecedentes(String antecedentes) {
//        this.antecedentes = antecedentes;
//    }
//
//}
