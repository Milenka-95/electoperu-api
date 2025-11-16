package com.solidware.electoperu.entity;

import lombok.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PadronElectoralId implements Serializable {
    private UUID idCiudadano;
    private Integer idMesa;
}
