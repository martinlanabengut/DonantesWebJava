package com.hemosol.donantes.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id_pedido;

    @Temporal(TemporalType.TIMESTAMP)//Al framework de persistencia hay que decirle de que manera se va a almacenar esa fecha en la base de datos, usamos temporal, que tiene 3 formas
    private Date fecha_alta;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_baja;

    @ManyToOne
    private Usuario usuario;

    @OneToOne
    private Respuesta_donador respuesta_donador;
    
    @OneToOne
    private Datos datos;

    public Pedido() {
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Respuesta_donador getRespuesta_donador() {
        return respuesta_donador;
    }

    public void setRespuesta_donador(Respuesta_donador respuesta_donador) {
        this.respuesta_donador = respuesta_donador;
    }

}
