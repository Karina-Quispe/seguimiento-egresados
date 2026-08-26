package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "estado_equipo")
@Getter
@Setter
@NoArgsConstructor
public class EstadoEquipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_equipo")
    private Integer idEstadoEquipo;

    @Column(name = "nombre_estado", length = 50, nullable = false)
    private String nombreEstado;

    @Column(name = "descripcion", length = 250)
    private String descripcion;
}