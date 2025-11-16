package com.solidware.electoperu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String token;
    @Builder.Default
    private String type = "Bearer";
    private UsuarioDTO usuario;
    
    public AuthResponse(String token, UsuarioDTO usuario) {
        this.token = token;
        this.type = "Bearer";
        this.usuario = usuario;
    }
}
