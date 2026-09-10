package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.UsuarioRol;
import pe.gob.ministeriopublico.backend.repository.UsuarioRolRepository;

@Service
public class UsuarioRolService {

    private final UsuarioRolRepository repository;

    public UsuarioRolService(UsuarioRolRepository repository) {
        this.repository = repository;
    }

    public List<UsuarioRol> findAll() {
        return repository.findAll();
    }

    public Optional<UsuarioRol> findById(Integer id) {
        return repository.findById(id);
    }

    public UsuarioRol save(UsuarioRol entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
