package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "partido_politico")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PartidoPolitico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPartido;

    @Column(nullable = false, unique = true)
    private String nombre;

    private String siglas;

    private String logoUrl;
}
