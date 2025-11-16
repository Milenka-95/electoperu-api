package com.solidware.electoperu.repository;

import com.solidware.electoperu.entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProvinciaRepository extends JpaRepository<Provincia, Long> {
    List<Provincia> findByDepartamentoId(Long departamentoId);
}
