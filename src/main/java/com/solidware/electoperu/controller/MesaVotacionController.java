package com.solidware.electoperu.controller;

import com.solidware.electoperu.entity.MesaVotacion;
import com.solidware.electoperu.service.MesaVotacionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mesas")
@RequiredArgsConstructor
@Tag(name = "Mesas de Votación", description = "API para gestión de mesas de votación")
public class MesaVotacionController {

    private final MesaVotacionService mesaVotacionService;

    @GetMapping
    @Operation(summary = "Listar todas las mesas de votación")
    public ResponseEntity<List<MesaVotacion>> findAll() {
        return ResponseEntity.ok(mesaVotacionService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener mesa por ID")
    public ResponseEntity<MesaVotacion> findById(@PathVariable Long id) {
        return ResponseEntity.ok(mesaVotacionService.findById(id));
    }

    @PostMapping
    @Operation(summary = "Crear nueva mesa de votación")
    public ResponseEntity<MesaVotacion> create(@RequestBody MesaVotacion mesa) {
        return ResponseEntity.ok(mesaVotacionService.create(mesa));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar mesa de votación")
    public ResponseEntity<MesaVotacion> update(@PathVariable Long id, @RequestBody MesaVotacion mesa) {
        return ResponseEntity.ok(mesaVotacionService.update(id, mesa));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar mesa de votación")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        mesaVotacionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
