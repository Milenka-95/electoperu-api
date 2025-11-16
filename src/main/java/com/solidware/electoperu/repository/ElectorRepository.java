package com.solidware.electoperu.repository;

import com.solidware.electoperu.entity.Elector;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ElectorRepository extends JpaRepository<Elector, Long> {
    Optional<Elector> findByDni(String dni);
}

