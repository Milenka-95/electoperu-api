package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "acta")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Acta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idActa;

    @ManyToOne
    @JoinColumn(name = "id_mesa")
    private MesaVotacion mesa;

    @ManyToOne
    @JoinColumn(name = "id_eleccion")
    private Eleccion eleccion;

    private String fotoUrl;

    private LocalDateTime horaRegistro;
}
