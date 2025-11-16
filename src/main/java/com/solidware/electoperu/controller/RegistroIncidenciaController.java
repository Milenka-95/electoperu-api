package com.solidware.electoperu.controller;

import com.solidware.electoperu.entity.RegistroIncidencia;
import com.solidware.electoperu.service.RegistroIncidenciaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incidencias")
@RequiredArgsConstructor
@Tag(name = "Incidencias", description = "API para registro y gestión de incidencias")
public class RegistroIncidenciaController {

    private final RegistroIncidenciaService registroIncidenciaService;

    @GetMapping
    @Operation(summary = "Listar todas las incidencias")
    public ResponseEntity<List<RegistroIncidencia>> findAll() {
        return ResponseEntity.ok(registroIncidenciaService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener incidencia por ID")
    public ResponseEntity<RegistroIncidencia> findById(@PathVariable Long id) {
        return ResponseEntity.ok(registroIncidenciaService.findById(id));
    }

    @PostMapping
    @Operation(summary = "Registrar nueva incidencia")
    public ResponseEntity<RegistroIncidencia> create(@RequestBody RegistroIncidencia incidencia) {
        return ResponseEntity.ok(registroIncidenciaService.create(incidencia));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar incidencia")
    public ResponseEntity<RegistroIncidencia> update(@PathVariable Long id, @RequestBody RegistroIncidencia incidencia) {
        return ResponseEntity.ok(registroIncidenciaService.update(id, incidencia));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar incidencia")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        registroIncidenciaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
