package com.solidware.electoperu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultadosMesaDTO {
    private Long id;
    private Long mesaId;
    private String mesaCodigo;
    private Long candidatoId;
    private String candidatoNombres;
    private String candidatoApellidos;
    private String partidoNombre;
    private String partidoSiglas;
    private Integer votos;
}
