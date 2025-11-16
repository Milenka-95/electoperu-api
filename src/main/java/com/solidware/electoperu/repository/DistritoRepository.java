package com.solidware.electoperu.repository;

import com.solidware.electoperu.entity.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DistritoRepository extends JpaRepository<Distrito, Long> {
    List<Distrito> findByProvinciaId(Long provinciaId);
}
