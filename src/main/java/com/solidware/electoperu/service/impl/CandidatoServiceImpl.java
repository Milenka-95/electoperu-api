package com.solidware.electoperu.service.impl;

import com.solidware.electoperu.entity.Candidato;
import com.solidware.electoperu.repository.CandidatoRepository;
import com.solidware.electoperu.service.CandidatoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CandidatoServiceImpl implements CandidatoService {

    private final CandidatoRepository candidatoRepo;

    @Override
    public List<Candidato> findAll() {
        return candidatoRepo.findAll();
    }

    @Override
    public Candidato findById(Long id) {
        return candidatoRepo.findById(id).orElse(null);
    }

    @Override
    public Candidato create(Candidato candidato) {
        return candidatoRepo.save(candidato);
    }

    @Override
    public Candidato update(Long id, Candidato candidato) {
        candidato.setId(id);
        return candidatoRepo.save(candidato);
    }

    @Override
    public void delete(Long id) {
        candidatoRepo.deleteById(id);
    }
}
