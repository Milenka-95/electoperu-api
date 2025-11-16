package com.solidware.electoperu.repository;

import com.solidware.electoperu.entity.ResultadosMesa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ResultadosMesaRepository extends JpaRepository<ResultadosMesa, Long> {
    List<ResultadosMesa> findByMesaId(Long mesaId);
}
