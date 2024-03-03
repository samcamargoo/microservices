package com.sam.pocmicroservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "tb_usuarios")
public class Usuario {

    @Id
    private String id;
    private String nome;
    private String email;

    public Usuario() {

    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
