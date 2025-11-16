package com.solidware.electoperu.repository;

import com.solidware.electoperu.entity.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
    List<Candidato> findByTipoId(Long tipoId);
}
