package com.solidware.electoperu.controller;

import com.solidware.electoperu.entity.Candidato;
import com.solidware.electoperu.service.CandidatoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidatos")
@RequiredArgsConstructor
public class CandidatoController {

    private final CandidatoService service;

    @GetMapping
    public List<Candidato> findAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public Candidato findById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public Candidato create(@RequestBody Candidato c) { return service.create(c); }

    @PutMapping("/{id}")
    public Candidato update(@PathVariable Long id, @RequestBody Candidato c) { return service.update(id, c); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
