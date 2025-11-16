-- V1__Initial_Schema.sql
-- ElectoPeru Database Initial Schema

-- Tabla: departamento
CREATE TABLE IF NOT EXISTS departamento (
    id_depa SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

-- Tabla: provincia
CREATE TABLE IF NOT EXISTS provincia (
    id_provincia SERIAL PRIMARY KEY,
    id_departamento INTEGER REFERENCES departamento(id_depa),
    nombre VARCHAR(100) NOT NULL
);

-- Tabla: distrito
CREATE TABLE IF NOT EXISTS distrito (
    id_distrito SERIAL PRIMARY KEY,
    id_provincia INTEGER REFERENCES provincia(id_provincia),
    nombre VARCHAR(100) NOT NULL
);

-- Tabla: local_votacion
CREATE TABLE IF NOT EXISTS local_votacion (
    id_local SERIAL PRIMARY KEY,
    nombre VARCHAR(200) NOT NULL,
    direccion VARCHAR(300) NOT NULL,
    id_distrito INTEGER REFERENCES distrito(id_distrito)
);

-- Tabla: mesa_votacion
CREATE TABLE IF NOT EXISTS mesa_votacion (
    id_mesa SERIAL PRIMARY KEY,
    codigo VARCHAR(10) UNIQUE NOT NULL,
    id_local INTEGER REFERENCES local_votacion(id_local),
    cantidad_electores INTEGER
);

-- Tabla: elector
CREATE TABLE IF NOT EXISTS elector (
    id BIGSERIAL PRIMARY KEY,
    dni VARCHAR(8) UNIQUE NOT NULL,
    nombres VARCHAR(120) NOT NULL,
    apellidos VARCHAR(120) NOT NULL,
    sexo VARCHAR(10) NOT NULL,
    edad INTEGER NOT NULL,
    distrito_id BIGINT NOT NULL,
    local_id BIGINT NOT NULL,
    mesa_id BIGINT NOT NULL
);

-- Tabla: rol
CREATE TABLE IF NOT EXISTS rol (
    id_rol SERIAL PRIMARY KEY,
    nombre VARCHAR(50) UNIQUE NOT NULL,
    descripcion VARCHAR(200)
);

-- Tabla: usuario
CREATE TABLE IF NOT EXISTS usuario (
    id_usuario UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    telefono VARCHAR(20),
    contraseña_hash VARCHAR(255) NOT NULL,
    estado BOOLEAN DEFAULT true,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    fecha_modificacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Tabla: usuario_rol
CREATE TABLE IF NOT EXISTS usuario_rol (
    id_usuario UUID REFERENCES usuario(id_usuario),
    id_rol INTEGER REFERENCES rol(id_rol),
    PRIMARY KEY (id_usuario, id_rol)
);

-- Tabla: tipo_eleccion
CREATE TABLE IF NOT EXISTS tipo_eleccion (
    id_tipo_eleccion SERIAL PRIMARY KEY,
    nombre VARCHAR(100) UNIQUE NOT NULL,
    descripcion VARCHAR(200)
);

-- Tabla: eleccion
CREATE TABLE IF NOT EXISTS eleccion (
    id_eleccion SERIAL PRIMARY KEY,
    nombre VARCHAR(200) NOT NULL,
    fecha_eleccion DATE NOT NULL,
    id_tipo_eleccion INTEGER REFERENCES tipo_eleccion(id_tipo_eleccion),
    estado VARCHAR(50)
);

-- Tabla: cargo
CREATE TABLE IF NOT EXISTS cargo (
    id_cargo SERIAL PRIMARY KEY,
    nombre VARCHAR(100) UNIQUE NOT NULL,
    descripcion VARCHAR(200)
);

-- Tabla: partido_politico
CREATE TABLE IF NOT EXISTS partido_politico (
    id_partido SERIAL PRIMARY KEY,
    nombre VARCHAR(150) UNIQUE NOT NULL,
    siglas VARCHAR(20),
    logo_url VARCHAR(500)
);

-- Tabla: candidato
CREATE TABLE IF NOT EXISTS candidato (
    id_candidato SERIAL PRIMARY KEY,
    id_partido INTEGER REFERENCES partido_politico(id_partido),
    id_eleccion INTEGER REFERENCES eleccion(id_eleccion),
    id_cargo INTEGER REFERENCES cargo(id_cargo),
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    foto_url VARCHAR(500)
);

-- Tabla: resultados_mesa
CREATE TABLE IF NOT EXISTS resultados_mesa (
    id BIGSERIAL PRIMARY KEY,
    mesa_id BIGINT NOT NULL,
    candidato_id BIGINT NOT NULL,
    votos INTEGER NOT NULL
);

-- Tabla: registro_incidencia
CREATE TABLE IF NOT EXISTS registro_incidencia (
    id BIGSERIAL PRIMARY KEY,
    mesa_id BIGINT NOT NULL,
    usuario_id BIGINT NOT NULL,
    descripcion VARCHAR(500) NOT NULL,
    estado VARCHAR(50) NOT NULL,
    fecha_registro VARCHAR(100) NOT NULL
);

-- Tabla: auditoria_evento
CREATE TABLE IF NOT EXISTS auditoria_evento (
    id_evento SERIAL PRIMARY KEY,
    id_usuario UUID,
    evento VARCHAR(100) NOT NULL,
    descripcion TEXT,
    ip_address VARCHAR(50),
    fecha_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insertar roles por defecto
INSERT INTO rol (nombre, descripcion) VALUES 
    ('ADMIN', 'Administrador del sistema'),
    ('USUARIO', 'Usuario estándar'),
    ('OBSERVADOR', 'Observador electoral')
ON CONFLICT (nombre) DO NOTHING;

-- Insertar tipos de elección
INSERT INTO tipo_eleccion (nombre, descripcion) VALUES 
    ('PRESIDENCIAL', 'Elección presidencial'),
    ('CONGRESIONAL', 'Elección de congresistas'),
    ('REGIONAL', 'Elección regional'),
    ('MUNICIPAL', 'Elección municipal')
ON CONFLICT (nombre) DO NOTHING;
