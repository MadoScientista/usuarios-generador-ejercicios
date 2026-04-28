package com.madoscientista.usuarios_generador_ejercicios.dto.UsuarioDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseUsuarioDTO {

    private long idUsuario;
    private String nombreUsuario;
}
