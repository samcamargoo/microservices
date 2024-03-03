package com.sam.pocmicroservice.controller;

import com.sam.pocmicroservice.dto.NovoUsuarioRequest;
import com.sam.pocmicroservice.entity.Usuario;
import com.sam.pocmicroservice.publisher.UsuarioPublisher;
import com.sam.pocmicroservice.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioPublisher publisher;

    public UserController(UsuarioRepository usuarioRepository, UsuarioPublisher publisher) {
        this.usuarioRepository = usuarioRepository;
        this.publisher = publisher;
    }

    @PostMapping
    ResponseEntity<?> criar(@RequestBody @Valid NovoUsuarioRequest request) {

        Usuario usuario = request.toModel();
        usuarioRepository.save(usuario);
        publisher.publicarMensagem(request);
        return ResponseEntity.ok().build();

    }
}
