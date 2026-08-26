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
@Table(name = "tipo_personal")
@Getter
@Setter
@NoArgsConstructor
public class TipoPersonal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_personal")
    private Integer idTipoPersonal;

    @Column(name = "nombre_tipo_personal", length = 100, nullable = false)
    private String nombreTipoPersonal;

    @Column(name = "descripcion", length = 250)
    private String descripcion;
}