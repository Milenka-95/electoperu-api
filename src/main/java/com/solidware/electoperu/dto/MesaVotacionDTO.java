package com.solidware.electoperu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MesaVotacionDTO {
    private Integer idMesa;
    private String codigo;
    private Integer localId;
    private String localNombre;
    private String localDireccion;
    private Integer cantidadElectores;
}
