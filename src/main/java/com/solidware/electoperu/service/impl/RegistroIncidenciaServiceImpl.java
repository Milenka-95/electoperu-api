package com.solidware.electoperu.service.impl;

import com.solidware.electoperu.entity.RegistroIncidencia;
import com.solidware.electoperu.repository.RegistroIncidenciaRepository;
import com.solidware.electoperu.service.RegistroIncidenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistroIncidenciaServiceImpl implements RegistroIncidenciaService {

    private final RegistroIncidenciaRepository registroIncidenciaRepository;

    @Override
    public List<RegistroIncidencia> findAll() {
        return registroIncidenciaRepository.findAll();
    }

    @Override
    public RegistroIncidencia findById(Long id) {
        return registroIncidenciaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Incidencia no encontrada: " + id));
    }

    @Override
    @Transactional
    public RegistroIncidencia create(RegistroIncidencia incidencia) {
        return registroIncidenciaRepository.save(incidencia);
    }

    @Override
    @Transactional
    public RegistroIncidencia update(Long id, RegistroIncidencia incidencia) {
        if (!registroIncidenciaRepository.existsById(id)) {
            throw new RuntimeException("Incidencia no encontrada: " + id);
        }
        incidencia.setId(id);
        return registroIncidenciaRepository.save(incidencia);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (!registroIncidenciaRepository.existsById(id)) {
            throw new RuntimeException("Incidencia no encontrada: " + id);
        }
        registroIncidenciaRepository.deleteById(id);
    }
}
