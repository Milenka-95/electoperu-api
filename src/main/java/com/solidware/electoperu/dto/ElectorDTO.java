package com.solidware.electoperu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ElectorDTO {
    private Long id;
    private String dni;
    private String nombres;
    private String apellidos;
    private String sexo;
    private Integer edad;
    private Long distritoId;
    private String distritoNombre;
    private Long localId;
    private String localNombre;
    private Long mesaId;
    private String mesaCodigo;
}
