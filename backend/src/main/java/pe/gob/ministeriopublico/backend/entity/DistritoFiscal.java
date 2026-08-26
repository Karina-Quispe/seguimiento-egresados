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
@Table(name = "distrito_fiscal")
@Getter
@Setter
@NoArgsConstructor
public class DistritoFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_distrito_fiscal")
    private Integer idDistritoFiscal;

    @Column(name = "nombre_distrito", length = 150, nullable = false)
    private String nombreDistrito;
}