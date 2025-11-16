package com.solidware.electoperu.service;

import com.solidware.electoperu.entity.PartidoPolitico;
import java.util.List;

public interface PartidoPoliticoService {
    List<PartidoPolitico> findAll();
    PartidoPolitico findById(Long id);
    PartidoPolitico create(PartidoPolitico partido);
    PartidoPolitico update(Long id, PartidoPolitico partido);
    void delete(Long id);
}
