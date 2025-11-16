package com.solidware.electoperu.repository;

import com.solidware.electoperu.entity.MesaVotacion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MesaVotacionRepository extends JpaRepository<MesaVotacion, Long> {
    List<MesaVotacion> findByLocalId(Long localId);
}
