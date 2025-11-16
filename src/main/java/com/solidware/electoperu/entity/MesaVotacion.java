package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mesa_votacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MesaVotacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMesa;

    @Column(nullable = false, unique = true, length = 10)
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "id_local")
    private LocalVotacion local;

    private Integer cantidadElectores;
}
