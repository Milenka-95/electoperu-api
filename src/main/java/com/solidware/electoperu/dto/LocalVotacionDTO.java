package com.solidware.electoperu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LocalVotacionDTO {
    private Integer idLocal;
    private String nombre;
    private String direccion;
    private Integer distritoId;
    private String distritoNombre;
    private Integer provinciaId;
    private String provinciaNombre;
    private Integer departamentoId;
    private String departamentoNombre;
}
