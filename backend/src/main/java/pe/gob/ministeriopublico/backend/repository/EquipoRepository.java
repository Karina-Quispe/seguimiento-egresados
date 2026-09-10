package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, Integer> {
}
