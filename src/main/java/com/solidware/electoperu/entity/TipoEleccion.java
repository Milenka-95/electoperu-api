package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tipo_eleccion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoEleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipo;

    @Column(nullable = false, unique = true)
    private String nombre;
}
