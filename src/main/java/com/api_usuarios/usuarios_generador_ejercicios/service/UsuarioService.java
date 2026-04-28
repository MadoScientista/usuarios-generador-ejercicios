package com.api_usuarios.usuarios_generador_ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api_usuarios.usuarios_generador_ejercicios.model.Usuario;
import com.api_usuarios.usuarios_generador_ejercicios.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public List<Usuario> getUsuarios(){
        return repo.findAll();
    }
}
