package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "candidato")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCandidato;

    @ManyToOne
    @JoinColumn(name = "id_partido")
    private PartidoPolitico partido;

    @ManyToOne
    @JoinColumn(name = "id_eleccion")
    private Eleccion eleccion;

    @ManyToOne
    @JoinColumn(name = "id_cargo")
    private Cargo cargo;

    @Column(nullable = false)
    private String nombres;

    @Column(nullable = false)
    private String apellidos;

    private String fotoUrl;
}
