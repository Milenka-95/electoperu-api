package com.solidware.electoperu.repository;

import com.solidware.electoperu.entity.Eleccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleccionRepository extends JpaRepository<Eleccion, Long> {
}
