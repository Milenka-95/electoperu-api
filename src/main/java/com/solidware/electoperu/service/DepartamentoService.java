package com.solidware.electoperu.service;

import com.solidware.electoperu.entity.Departamento;
import com.solidware.electoperu.repository.DepartamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartamentoService {

    private final DepartamentoRepository repository;

    public List<Departamento> findAll() {
        return repository.findAll();
    }

    public Departamento findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Departamento no encontrado: " + id));
    }

    public Departamento create(Departamento d) {
        return repository.save(d);
    }

    @Transactional
    public Departamento update(Long id, Departamento d) {
        d.setIdDepa(id.intValue());
        return repository.save(d);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}