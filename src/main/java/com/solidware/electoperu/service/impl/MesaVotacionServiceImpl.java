package com.solidware.electoperu.service.impl;

import com.solidware.electoperu.entity.MesaVotacion;
import com.solidware.electoperu.repository.MesaVotacionRepository;
import com.solidware.electoperu.service.MesaVotacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MesaVotacionServiceImpl implements MesaVotacionService {

    private final MesaVotacionRepository mesaVotacionRepository;

    @Override
    public List<MesaVotacion> findAll() {
        return mesaVotacionRepository.findAll();
    }

    @Override
    public MesaVotacion findById(Long id) {
        return mesaVotacionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mesa de votación no encontrada: " + id));
    }

    @Override
    @Transactional
    public MesaVotacion create(MesaVotacion mesa) {
        return mesaVotacionRepository.save(mesa);
    }

    @Override
    @Transactional
    public MesaVotacion update(Long id, MesaVotacion mesa) {
        if (!mesaVotacionRepository.existsById(id)) {
            throw new RuntimeException("Mesa de votación no encontrada: " + id);
        }
        mesa.setIdMesa(id.intValue());
        return mesaVotacionRepository.save(mesa);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (!mesaVotacionRepository.existsById(id)) {
            throw new RuntimeException("Mesa de votación no encontrada: " + id);
        }
        mesaVotacionRepository.deleteById(id);
    }
}
