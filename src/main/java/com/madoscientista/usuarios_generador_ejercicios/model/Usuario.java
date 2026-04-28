package com.madoscientista.usuarios_generador_ejercicios.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;
    
    private String nombre;
    private String apellido;

    @Email
    private String email;
    private String userName;
    private String password;

    @OneToMany(mappedBy = "usuario")
    private List<Ejercicio> ejercicios;

    @OneToMany(mappedBy = "usuario")
    private List<Material> materiales;
}
