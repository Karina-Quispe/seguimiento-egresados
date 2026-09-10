package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Rol;
import pe.gob.ministeriopublico.backend.repository.RolRepository;

@Service
public class RolService {

    private final RolRepository repository;

    public RolService(RolRepository repository) {
        this.repository = repository;
    }

    public List<Rol> findAll() {
        return repository.findAll();
    }

    public Optional<Rol> findById(Integer id) {
        return repository.findById(id);
    }

    public Rol save(Rol entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
