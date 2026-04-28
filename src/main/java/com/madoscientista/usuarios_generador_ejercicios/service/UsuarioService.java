package com.madoscientista.usuarios_generador_ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madoscientista.usuarios_generador_ejercicios.model.Usuario;
import com.madoscientista.usuarios_generador_ejercicios.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public List<Usuario> getUsuarios(){
        return repo.findAll();
    }
}
