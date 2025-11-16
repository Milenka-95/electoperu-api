package com.solidware.electoperu.service;

import com.solidware.electoperu.entity.Candidato;
import java.util.List;

public interface CandidatoService {
    List<Candidato> findAll();
    Candidato findById(Long id);
    Candidato create(Candidato candidato);
    Candidato update(Long id, Candidato candidato);
    void delete(Long id);
}
