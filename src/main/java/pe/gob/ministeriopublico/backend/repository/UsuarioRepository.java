package pe.gob.ministeriopublico.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.ministeriopublico.backend.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
