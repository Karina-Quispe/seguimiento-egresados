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
@Table(name = "tipo_mantenimiento")
@Getter
@Setter
@NoArgsConstructor
public class TipoMantenimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_mantenimiento")
    private Integer idTipoMantenimiento;

    @Column(name = "nombre_tipo", length = 50, nullable = false)
    private String nombreTipo;

    @Column(name = "descripcion", length = 250)
    private String descripcion;
}