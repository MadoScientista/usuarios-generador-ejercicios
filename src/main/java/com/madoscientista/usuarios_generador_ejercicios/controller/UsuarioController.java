package com.madoscientista.usuarios_generador_ejercicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madoscientista.usuarios_generador_ejercicios.model.Usuario;
import com.madoscientista.usuarios_generador_ejercicios.service.UsuarioService;

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    // Retorna la lista de usuarios
    public ResponseEntity<?> getUsuarios(){
        List<Usuario> usuarios = service.getUsuarios();
        return ResponseEntity.ok(usuarios);
    }
}
