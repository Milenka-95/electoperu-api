package com.solidware.electoperu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private UUID idUsuario;
    private String nombres;
    private String apellidos;
    private String email;
    private String telefono;
    private Boolean estado;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
    private Set<String> roles;
}
