package com.solidware.electoperu.service;

import com.solidware.electoperu.entity.MesaVotacion;
import java.util.List;

public interface MesaVotacionService {
    List<MesaVotacion> findAll();
    MesaVotacion findById(Long id);
    MesaVotacion create(MesaVotacion mesa);
    MesaVotacion update(Long id, MesaVotacion mesa);
    void delete(Long id);
}
