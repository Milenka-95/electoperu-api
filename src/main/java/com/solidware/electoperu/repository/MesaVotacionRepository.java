package com.solidware.electoperu.repository;

import com.solidware.electoperu.entity.MesaVotacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MesaVotacionRepository extends JpaRepository<MesaVotacion, Long> {
    Optional<MesaVotacion> findByCodigo(String codigo);
    
    @Query("SELECT m FROM MesaVotacion m WHERE m.local.idLocal = :localId")
    List<MesaVotacion> findByLocalId(Integer localId);
}
