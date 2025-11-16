package com.solidware.electoperu.repository;

import com.solidware.electoperu.entity.RegistroIncidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RegistroIncidenciaRepository extends JpaRepository<RegistroIncidencia, Long> {
    List<RegistroIncidencia> findByUsuarioId(Long usuarioId);
}
