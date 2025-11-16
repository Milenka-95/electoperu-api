package com.solidware.electoperu.service.impl;

import com.solidware.electoperu.entity.ResultadosMesa;
import com.solidware.electoperu.repository.ResultadosMesaRepository;
import com.solidware.electoperu.service.ResultadosMesaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResultadosMesaServiceImpl implements ResultadosMesaService {

    private final ResultadosMesaRepository resultadosMesaRepository;

    @Override
    public List<ResultadosMesa> findAll() {
        return resultadosMesaRepository.findAll();
    }

    @Override
    public ResultadosMesa findById(Long id) {
        return resultadosMesaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resultado no encontrado: " + id));
    }

    @Override
    @Transactional
    public ResultadosMesa create(ResultadosMesa resultado) {
        return resultadosMesaRepository.save(resultado);
    }

    @Override
    @Transactional
    public ResultadosMesa update(Long id, ResultadosMesa resultado) {
        if (!resultadosMesaRepository.existsById(id)) {
            throw new RuntimeException("Resultado no encontrado: " + id);
        }
        resultado.setId(id);
        return resultadosMesaRepository.save(resultado);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (!resultadosMesaRepository.existsById(id)) {
            throw new RuntimeException("Resultado no encontrado: " + id);
        }
        resultadosMesaRepository.deleteById(id);
    }
}
