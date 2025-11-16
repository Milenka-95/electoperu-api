package com.solidware.electoperu.service;

import com.solidware.electoperu.entity.Elector;
import java.util.List;

public interface ElectorService {
    List<Elector> findAll();
    Elector findById(Long id);
    Elector create(Elector elector);
    Elector update(Long id, Elector elector);
    void delete(Long id);
}
