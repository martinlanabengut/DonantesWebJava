
package com.hemosol.donantes.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity 
public class Datos {
    
     @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
     private String id_datos;
     private String nombre_del_necesitado;
     private String grupo_sanguineo_necesitado;
     private int cant_donantes_necesarios;
     private String centro_de_salud;
     
     @Temporal(TemporalType.TIMESTAMP)
     private Date horarios_para_donar;//Son los horarios en los que se puede donar

    public Datos() {
    }

    public String getId_datos() {
        return id_datos;
    }

    public void setId_datos(String id_datos) {
        this.id_datos = id_datos;
    }

    public String getNombre_del_necesitado() {
        return nombre_del_necesitado;
    }

    public void setNombre_del_necesitado(String nombre_del_necesitado) {
        this.nombre_del_necesitado = nombre_del_necesitado;
    }

    public String getGrupo_sanguineo_necesitado() {
        return grupo_sanguineo_necesitado;
    }

    public void setGrupo_sanguineo_necesitado(String grupo_sanguineo_necesitado) {
        this.grupo_sanguineo_necesitado = grupo_sanguineo_necesitado;
    }

    public int getCant_donantes_necesarios() {
        return cant_donantes_necesarios;
    }

    public void setCant_donantes_necesarios(int cant_donantes_necesarios) {
        this.cant_donantes_necesarios = cant_donantes_necesarios;
    }

    public String getCentro_de_salud() {
        return centro_de_salud;
    }

    public void setCentro_de_salud(String centro_de_salud) {
        this.centro_de_salud = centro_de_salud;
    }

    public Date getHorarios_para_donar() {
        return horarios_para_donar;
    }

    public void setHorarios_para_donar(Date horarios_para_donar) {
        this.horarios_para_donar = horarios_para_donar;
    }
     
     
    
   
    
    
    
}
