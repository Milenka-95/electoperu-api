package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "acta_detalle")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ActaDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalle;

    @ManyToOne
    @JoinColumn(name = "id_acta")
    private Acta acta;

    @ManyToOne
    @JoinColumn(name = "id_candidato")
    private Candidato candidato;

    private Integer votos;
}
