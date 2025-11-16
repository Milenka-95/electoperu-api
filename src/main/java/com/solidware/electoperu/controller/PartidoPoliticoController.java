package com.solidware.electoperu.controller;

import com.solidware.electoperu.entity.PartidoPolitico;
import com.solidware.electoperu.service.PartidoPoliticoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/partidos")
@RequiredArgsConstructor
@Tag(name = "Partidos Políticos", description = "API para gestión de partidos políticos")
public class PartidoPoliticoController {

    private final PartidoPoliticoService partidoPoliticoService;

    @GetMapping
    @Operation(summary = "Listar todos los partidos políticos")
    public ResponseEntity<List<PartidoPolitico>> findAll() {
        return ResponseEntity.ok(partidoPoliticoService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener partido político por ID")
    public ResponseEntity<PartidoPolitico> findById(@PathVariable Long id) {
        return ResponseEntity.ok(partidoPoliticoService.findById(id));
    }

    @PostMapping
    @Operation(summary = "Crear nuevo partido político")
    public ResponseEntity<PartidoPolitico> create(@RequestBody PartidoPolitico partido) {
        return ResponseEntity.ok(partidoPoliticoService.create(partido));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar partido político")
    public ResponseEntity<PartidoPolitico> update(@PathVariable Long id, @RequestBody PartidoPolitico partido) {
        return ResponseEntity.ok(partidoPoliticoService.update(id, partido));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar partido político")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        partidoPoliticoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
