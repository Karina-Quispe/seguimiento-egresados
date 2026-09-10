package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Integer> {
}
