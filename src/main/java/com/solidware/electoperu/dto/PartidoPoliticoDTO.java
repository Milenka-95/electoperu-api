package com.solidware.electoperu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartidoPoliticoDTO {
    private Integer idPartido;
    private String nombre;
    private String siglas;
    private String logoUrl;
}
