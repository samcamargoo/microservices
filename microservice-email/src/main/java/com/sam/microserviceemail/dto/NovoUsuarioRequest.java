package com.sam.microserviceemail.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record NovoUsuarioRequest(@NotBlank String nome, @Email @NotBlank String email) {
}
