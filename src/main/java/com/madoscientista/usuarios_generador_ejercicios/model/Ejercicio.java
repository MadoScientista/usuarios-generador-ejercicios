package com.madoscientista.usuarios_generador_ejercicios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEjercicio;

    private String tema;
    private String contexto;
    private String incognita;
    private String dificultad;
    private long idPlantillaEnunciado;
    private String enunciado;


    // Separaré el material en un microservicio aparte
    // Yo creo lo usaré como material público pero con id del usuario que lo creó
    
    // @ManyToOne
    // @JoinColumn(name = "idMaterial", nullable = false)
    // private Material material;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

}
