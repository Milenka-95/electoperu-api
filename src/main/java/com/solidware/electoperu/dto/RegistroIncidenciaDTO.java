package com.solidware.electoperu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegistroIncidenciaDTO {
    private Long id;
    private Long mesaId;
    private String mesaCodigo;
    private Long usuarioId;
    private String usuarioNombres;
    private String descripcion;
    private String estado;
    private String fechaRegistro;
}
