package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "sincronizacion_offline")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SincronizacionOffline {

    @Id
    @GeneratedValue
    private UUID idSync;

    private UUID idCiudadano;

    private LocalDateTime fechaSync;

    private Integer cantidadVotos;

    private String dispositivo;
}
