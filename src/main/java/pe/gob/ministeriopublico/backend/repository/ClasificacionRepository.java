package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Clasificacion;

public interface ClasificacionRepository extends JpaRepository<Clasificacion, Integer> {
}
