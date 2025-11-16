package com.solidware.electoperu.repository;

import com.solidware.electoperu.entity.LocalVotacion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LocalVotacionRepository extends JpaRepository<LocalVotacion, Long> {
    List<LocalVotacion> findByDistritoId(Long distritoId);
}
