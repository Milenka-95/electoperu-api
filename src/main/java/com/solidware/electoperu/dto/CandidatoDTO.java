package com.solidware.electoperu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CandidatoDTO {
    private Integer idCandidato;
    private String nombres;
    private String apellidos;
    private String fotoUrl;
    private Integer partidoId;
    private String partidoNombre;
    private String partidoSiglas;
    private String partidoLogoUrl;
    private Integer eleccionId;
    private String eleccionNombre;
    private Integer cargoId;
    private String cargoNombre;
}
