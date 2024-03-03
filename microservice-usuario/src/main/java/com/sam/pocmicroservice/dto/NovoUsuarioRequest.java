package com.sam.pocmicroservice.dto;

import com.sam.pocmicroservice.entity.Usuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record NovoUsuarioRequest(@NotBlank String nome, @Email @NotBlank String email) {

    public Usuario toModel() {
        return new Usuario(nome, email);
    }
}
