package com.madoscientista.usuarios_generador_ejercicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madoscientista.usuarios_generador_ejercicios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    

}
