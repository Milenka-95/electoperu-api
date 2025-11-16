package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "elector")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Elector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 8, unique = true)
    private String dni;

    @Column(nullable = false, length = 120)
    private String nombres;

    @Column(nullable = false, length = 120)
    private String apellidos;

    @Column(nullable = false)
    private String sexo;

    @Column(nullable = false)
    private Integer edad;

    @Column(name = "distrito_id", nullable = false)
    private Long distritoId;

    @Column(name = "local_id", nullable = false)
    private Long localId;

    @Column(name = "mesa_id", nullable = false)
    private Long mesaId;
}
