package com.solidware.electoperu.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "auth_sesion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthSesion {

    @Id
    @GeneratedValue
    private UUID idSesion;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(nullable = false)
    private String token;

    @Column(nullable = false)
    private LocalDateTime expiracion;

    private String ip;

    private Boolean activo;
}
