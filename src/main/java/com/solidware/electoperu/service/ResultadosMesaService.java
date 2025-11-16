package com.solidware.electoperu.service;

import com.solidware.electoperu.entity.ResultadosMesa;
import java.util.List;

public interface ResultadosMesaService {
    List<ResultadosMesa> findAll();
    ResultadosMesa findById(Long id);
    ResultadosMesa create(ResultadosMesa resultado);
    ResultadosMesa update(Long id, ResultadosMesa resultado);
    void delete(Long id);
}
