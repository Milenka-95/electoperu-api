package com.solidware.electoperu.service;

import com.solidware.electoperu.entity.RegistroIncidencia;
import java.util.List;

public interface RegistroIncidenciaService {
    List<RegistroIncidencia> findAll();
    RegistroIncidencia findById(Long id);
    RegistroIncidencia create(RegistroIncidencia incidencia);
    RegistroIncidencia update(Long id, RegistroIncidencia incidencia);
    void delete(Long id);
}
