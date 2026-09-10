package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Integer> {
}
