package pe.gob.ministeriopublico.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sede")
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sede")
    private Integer idSede;

    @Column(name = "id_distrito_fiscal", nullable = false)
    private Integer idDistritoFiscal;

    @Column(name = "nombre_sede", nullable = false, length = 150)
    private String nombreSede;

    @Column(name = "direccion", length = 300)
    private String direccion;

    public Sede() {
    }

    public Sede(Integer idDistritoFiscal, String nombreSede, String direccion) {
        this.idDistritoFiscal = idDistritoFiscal;
        this.nombreSede = nombreSede;
        this.direccion = direccion;
    }

    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    public Integer getIdDistritoFiscal() {
        return idDistritoFiscal;
    }

    public void setIdDistritoFiscal(Integer idDistritoFiscal) {
        this.idDistritoFiscal = idDistritoFiscal;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
