/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemosol.donantes.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Martin Lana
 */
@Entity
public class Respuesta_donador { //es la respuesta del donador, es decir, si cumple los requisitos para donar, puede o no donar. si acepta, el contador de donadores necesarios debe bajar

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id_respuesta;

    public Respuesta_donador() {
    }

}
