package com.solidware.electoperu.service;

import com.solidware.electoperu.entity.Usuario;
import java.util.List;
import java.util.UUID;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario findById(UUID id);
    Usuario create(Usuario usuario);
    Usuario update(UUID id, Usuario usuario);
    void delete(UUID id);
}
