package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "distrito")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDistrito;

    @ManyToOne
    @JoinColumn(name = "id_provincia")
    private Provincia provincia;

    @Column(nullable = false)
    private String nombre;
}
