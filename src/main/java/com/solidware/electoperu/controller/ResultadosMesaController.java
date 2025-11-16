package com.solidware.electoperu.controller;

import com.solidware.electoperu.entity.ResultadosMesa;
import com.solidware.electoperu.service.ResultadosMesaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resultados")
@RequiredArgsConstructor
@Tag(name = "Resultados", description = "API para gestión de resultados electorales por mesa")
public class ResultadosMesaController {

    private final ResultadosMesaService resultadosMesaService;

    @GetMapping
    @Operation(summary = "Listar todos los resultados")
    public ResponseEntity<List<ResultadosMesa>> findAll() {
        return ResponseEntity.ok(resultadosMesaService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener resultado por ID")
    public ResponseEntity<ResultadosMesa> findById(@PathVariable Long id) {
        return ResponseEntity.ok(resultadosMesaService.findById(id));
    }

    @PostMapping
    @Operation(summary = "Registrar nuevo resultado")
    public ResponseEntity<ResultadosMesa> create(@RequestBody ResultadosMesa resultado) {
        return ResponseEntity.ok(resultadosMesaService.create(resultado));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar resultado")
    public ResponseEntity<ResultadosMesa> update(@PathVariable Long id, @RequestBody ResultadosMesa resultado) {
        return ResponseEntity.ok(resultadosMesaService.update(id, resultado));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar resultado")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        resultadosMesaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
