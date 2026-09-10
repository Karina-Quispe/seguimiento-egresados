# Ejemplos JSON para Postman

Base URL: http://localhost:8080/api

## 1) distrito-fiscales
POST /distrito-fiscales
{
  "nombreDistrito": "Lima Centro"
}

## 2) tipo-personales
POST /tipo-personales
{
  "nombreTipoPersonal": "Analista",
  "descripcion": "Personal administrativo"
}

## 3) marcas
POST /marcas
{
  "nombreMarca": "Dell"
}

## 4) clasificaciones
POST /clasificaciones
{
  "nombreClasificacion": "Laptop",
  "descripcion": "Computadora portátil"
}

## 5) estado-equipos
POST /estado-equipos
{
  "nombreEstado": "OPERATIVO",
  "descripcion": "Disponible para uso"
}

## 6) tipo-mantenimientos
POST /tipo-mantenimientos
{
  "nombreTipo": "Preventivo",
  "descripcion": "Mantenimiento programado"
}

## 7) roles
POST /roles
{
  "nombreRol": "ADMIN"
}

## 8) usuarios
POST /usuarios
{
  "usuario": "admin",
  "contrasena": "123456",
  "nombreCompleto": "Administrador Sistema",
  "correoElectronico": "admin@mp.gob.pe",
  "estado": "ACTIVO",
  "fechaCreacion": "2026-09-10T10:00:00"
}

## 9) sedes
POST /sedes
{
  "idDistritoFiscal": 1,
  "nombreSede": "Sede Central",
  "direccion": "Av. Brasil 123"
}

## 10) modelos
POST /modelos
{
  "idMarca": 1,
  "nombreModelo": "Latitude 5420",
  "descripcion": "Laptop de oficina"
}

## 11) personales
POST /personales
{
  "idTipoPersonal": 1,
  "dni": "12345678",
  "nombres": "Ana",
  "apellidoPaterno": "Pérez",
  "apellidoMaterno": "López",
  "correo": "ana.perez@mp.gob.pe",
  "telefono": "987654321"
}

## 12) despachos
POST /despachos
{
  "idSede": 1,
  "nombreDespacho": "Despacho de Tecnología",
  "tipoProceso": "Administrativo"
}

## 13) equipos
POST /equipos
{
  "idModelo": 1,
  "idClasificacion": 1,
  "idEstadoEquipo": 1,
  "codigoPatrimonial": "EQ-001",
  "numeroSerie": "SN-123456",
  "observacion": "Equipo nuevo",
  "fechaAdquisicion": "2024-01-15",
  "fechaRegistro": "2026-09-10T10:00:00"
}

## 14) asignacion-equipos
POST /asignacion-equipos
{
  "idEquipo": 1,
  "idDespacho": 1,
  "idPersonal": 1,
  "fechaInicio": "2026-09-01",
  "fechaFin": "2026-12-31",
  "observacion": "Asignación inicial",
  "fechaRegistro": "2026-09-10T10:00:00"
}

## 15) mantenimientos
POST /mantenimientos
{
  "idEquipo": 1,
  "idTipoMantenimiento": 1,
  "fechaMantenimiento": "2026-09-05",
  "diagnostico": "Falla de batería",
  "trabajoRealizado": "Cambio de batería y prueba de funcionamiento",
  "repuesto": "Batería nueva",
  "responsableMantenimiento": "Técnico 1",
  "observacion": "Equipo en servicio",
  "fechaRegistro": "2026-09-10T10:00:00"
}

## 16) usuario-roles
POST /usuario-roles
{
  "idUsuario": 1,
  "idRol": 1
}

## Consultas
GET /api/{recurso}
GET /api/{recurso}/{id}
PUT /api/{recurso}/{id}
DELETE /api/{recurso}/{id}
