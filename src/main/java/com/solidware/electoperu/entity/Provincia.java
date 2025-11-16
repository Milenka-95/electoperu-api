package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "provincia")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Provincia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProvincia;

    @ManyToOne
    @JoinColumn(name = "id_depa")
    private Departamento departamento;

    @Column(nullable = false)
    private String nombre;
}
