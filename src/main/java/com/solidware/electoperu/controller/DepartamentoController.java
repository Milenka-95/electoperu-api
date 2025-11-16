package com.solidware.electoperu.controller;

import com.solidware.electoperu.entity.Departamento;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departamentos")
@RequiredArgsConstructor
public class DepartamentoController {

    private final DepartamentoService service;

    @GetMapping
    public List<Departamento> findAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public Departamento findById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public Departamento create(@RequestBody Departamento d) { return service.create(d); }

    @PutMapping("/{id}")
    public Departamento update(@PathVariable Long id, @RequestBody Departamento d) { return service.update(id, d); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
