package com.solidware.electoperu.controller;

import com.solidware.electoperu.entity.Elector;
import com.solidware.electoperu.repository.ElectorRepository;
import com.solidware.electoperu.service.ElectorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/electores")
@RequiredArgsConstructor
@Tag(name = "Electores", description = "API para gestión de electores")
public class ElectorController {

    private final ElectorService electorService;
    private final ElectorRepository electorRepository;

    @GetMapping
    @Operation(summary = "Listar todos los electores")
    public ResponseEntity<List<Elector>> findAll() {
        return ResponseEntity.ok(electorService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener elector por ID")
    public ResponseEntity<Elector> findById(@PathVariable Long id) {
        return ResponseEntity.ok(electorService.findById(id));
    }

    @GetMapping("/dni/{dni}")
    @Operation(summary = "Buscar elector por DNI")
    public ResponseEntity<Elector> findByDni(@PathVariable String dni) {
        return ResponseEntity.ok(electorRepository.findByDni(dni)
                .orElseThrow(() -> new RuntimeException("Elector no encontrado con DNI: " + dni)));
    }

    @PostMapping
    @Operation(summary = "Crear nuevo elector")
    public ResponseEntity<Elector> create(@RequestBody Elector elector) {
        return ResponseEntity.ok(electorService.create(elector));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar elector")
    public ResponseEntity<Elector> update(@PathVariable Long id, @RequestBody Elector elector) {
        return ResponseEntity.ok(electorService.update(id, elector));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar elector")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        electorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
