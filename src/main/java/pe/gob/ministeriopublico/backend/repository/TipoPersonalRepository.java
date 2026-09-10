package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.TipoPersonal;

public interface TipoPersonalRepository extends JpaRepository<TipoPersonal, Integer> {
}
