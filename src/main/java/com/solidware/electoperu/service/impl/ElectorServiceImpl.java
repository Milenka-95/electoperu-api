package com.solidware.electoperu.service.impl;

import com.solidware.electoperu.entity.Elector;
import com.solidware.electoperu.repository.ElectorRepository;
import com.solidware.electoperu.service.ElectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ElectorServiceImpl implements ElectorService {

    private final ElectorRepository electorRepository;

    @Override
    public List<Elector> findAll() {
        return electorRepository.findAll();
    }

    @Override
    public Elector findById(Long id) {
        return electorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Elector no encontrado: " + id));
    }

    @Override
    @Transactional
    public Elector create(Elector elector) {
        return electorRepository.save(elector);
    }

    @Override
    @Transactional
    public Elector update(Long id, Elector elector) {
        if (!electorRepository.existsById(id)) {
            throw new RuntimeException("Elector no encontrado: " + id);
        }
        elector.setId(id);
        return electorRepository.save(elector);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (!electorRepository.existsById(id)) {
            throw new RuntimeException("Elector no encontrado: " + id);
        }
        electorRepository.deleteById(id);
    }
}
