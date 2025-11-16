package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "resultados_mesa")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultadosMesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mesa_id", nullable = false)
    private Long mesaId;

    @Column(name = "candidato_id", nullable = false)
    private Long candidatoId;

    @Column(nullable = false)
    private Integer votos;
}
