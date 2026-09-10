package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.EstadoEquipo;

public interface EstadoEquipoRepository extends JpaRepository<EstadoEquipo, Integer> {
}
