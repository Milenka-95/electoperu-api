package com.solidware.electoperu.controller;

import com.solidware.electoperu.entity.Usuario;
import com.solidware.electoperu.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
@Tag(name = "Usuarios", description = "API para gestión de usuarios del sistema")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    @Operation(summary = "Listar todos los usuarios")
    public ResponseEntity<List<Usuario>> findAll() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener usuario por ID")
    public ResponseEntity<Usuario> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @PostMapping
    @Operation(summary = "Crear nuevo usuario")
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.create(usuario));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar usuario")
    public ResponseEntity<Usuario> update(@PathVariable UUID id, @RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.update(id, usuario));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar usuario")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
