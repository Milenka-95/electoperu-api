package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "registro_incidencia")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistroIncidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mesa_id", nullable = false)
    private Long mesaId;

    @Column(name = "usuario_id", nullable = false)
    private Long usuarioId;

    @Column(nullable = false, length = 500)
    private String descripcion;

    @Column(nullable = false)
    private String estado;

    @Column(name = "fecha_registro", nullable = false)
    private String fechaRegistro;
}
