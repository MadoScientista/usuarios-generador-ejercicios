package com.api_usuarios.usuarios_generador_ejercicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_usuarios.usuarios_generador_ejercicios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    

}
