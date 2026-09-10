package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Personal;

public interface PersonalRepository extends JpaRepository<Personal, Integer> {
}
