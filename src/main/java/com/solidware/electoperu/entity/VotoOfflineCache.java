package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "voto_offline_cache")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VotoOfflineCache {

    @Id
    @GeneratedValue
    private UUID idCache;

    private UUID idCiudadano;

    private Integer idEleccion;

    private Integer idCandidato;

    private LocalDateTime timestampLocal;

    private Boolean sincronizado;
}
