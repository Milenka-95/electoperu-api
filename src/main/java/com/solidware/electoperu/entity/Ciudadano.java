package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "ciudadano")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ciudadano {

    @Id
    @GeneratedValue
    private UUID idCiudadano;

    @Column(length = 8, nullable = false, unique = true)
    private String dni;

    @Column(nullable = false)
    private String nombres;

    @Column(nullable = false)
    private String apellidos;

    private LocalDate fechaNacimiento;

    private String direccion;

    private String telefono;

    private String email;
}
