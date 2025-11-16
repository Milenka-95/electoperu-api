package com.solidware.electoperu.repository;

import com.solidware.electoperu.entity.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VotoRepository extends JpaRepository<Voto, Long> {

    boolean existsByElectorIdAndEleccionAnio(Long electorId, Integer eleccionAnio);

    List<Voto> findByMesaId(Long mesaId);
}
