package com.madoscientista.usuarios_generador_ejercicios.dto.UsuarioDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestUsuarioDTO {

    private String nombre;
    private String apellido;
    private String email;
    private String userName;
    private String password;
}
