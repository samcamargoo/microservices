package com.sam.pocmicroservice.repository;

import com.sam.pocmicroservice.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, Long> {
}
