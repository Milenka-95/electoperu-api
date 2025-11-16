package com.solidware.electoperu.service.impl;

import com.solidware.electoperu.entity.PartidoPolitico;
import com.solidware.electoperu.repository.PartidoPoliticoRepository;
import com.solidware.electoperu.service.PartidoPoliticoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartidoPoliticoServiceImpl implements PartidoPoliticoService {

    private final PartidoPoliticoRepository partidoRepo;

    @Override
    public List<PartidoPolitico> findAll() {
        return partidoRepo.findAll();
    }

    @Override
    public PartidoPolitico findById(Long id) {
        return partidoRepo.findById(id).orElse(null);
    }

    @Override
    public PartidoPolitico create(PartidoPolitico partido) {
        return partidoRepo.save(partido);
    }

    @Override
    public PartidoPolitico update(Long id, PartidoPolitico partido) {
        partido.setId(id);
        return partidoRepo.save(partido);
    }

    @Override
    public void delete(Long id) {
        partidoRepo.deleteById(id);
    }
}
