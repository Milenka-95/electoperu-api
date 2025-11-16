package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "padron_electoral")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(PadronElectoralId.class)
public class PadronElectoral {

    @Id
    private UUID idCiudadano;

    @Id
    private Integer idMesa;

    private Boolean habilitado;
}
