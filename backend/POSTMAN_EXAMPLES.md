# Ejemplos de Postman

Base URL: http://localhost:8080/api

## 1. Distrito Fiscal
POST /distrito-fiscales
{
  "nombreDistrito": "Lima Centro"
}

## 2. Tipo Personal
POST /tipo-personales
{
  "nombreTipoPersonal": "Analista",
  "descripcion": "Personal administrativo"
}

## 3. Marca
POST /marcas
{
  "nombreMarca": "Dell"
}

## 4. Clasificacion
POST /clasificaciones
{
  "nombreClasificacion": "Laptop",
  "descripcion": "Computadora portátil"
}

## 5. Estado Equipo
POST /estado-equipos
{
  "nombreEstado": "OPERATIVO",
  "descripcion": "Disponible para uso"
}

## 6. Tipo Mantenimiento
POST /tipo-mantenimientos
{
  "nombreTipo": "Preventivo",
  "descripcion": "Mantenimiento programado"
}

## 7. Rol
POST /roles
{
  "nombreRol": "ADMIN"
}

## 8. Usuario
POST /usuarios
{
  "usuario": "admin",
  "contrasena": "123456",
  "nombreCompleto": "Administrador Sistema",
  "correoElectronico": "admin@mp.gob.pe",
  "estado": "ACTIVO",
  "fechaCreacion": "2026-09-10T10:00:00"
}

## 9. Sede
POST /sedes
{
  "idDistritoFiscal": 1,
  "nombreSede": "Sede Central",
  "direccion": "Av. Brasil 123"
}

## 10. Modelo
POST /modelos
{
  "idMarca": 1,
  "nombreModelo": "Latitude 5420",
  "descripcion": "Laptop de oficina"
}

## 11. Personal
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

## 12. Despacho
POST /despachos
{
  "idSede": 1,
  "nombreDespacho": "Despacho de Tecnología",
  "tipoProceso": "Administrativo"
}

## 13. Equipo
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

## 14. Asignacion Equipo
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

## 15. Mantenimiento
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

## 16. Usuario Rol
POST /usuario-roles
{
  "idUsuario": 1,
  "idRol": 1
}

### CRUD general
- GET /api/{recurso}
- GET /api/{recurso}/{id}
- POST /api/{recurso}
- PUT /api/{recurso}/{id}
- DELETE /api/{recurso}/{id}
