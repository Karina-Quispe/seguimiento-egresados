package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.AsignacionEquipo;
import pe.gob.ministeriopublico.backend.repository.AsignacionEquipoRepository;

@Service
public class AsignacionEquipoService {

    private final AsignacionEquipoRepository repository;

    public AsignacionEquipoService(AsignacionEquipoRepository repository) {
        this.repository = repository;
    }

    public List<AsignacionEquipo> findAll() {
        return repository.findAll();
    }

    public Optional<AsignacionEquipo> findById(Integer id) {
        return repository.findById(id);
    }

    public AsignacionEquipo save(AsignacionEquipo entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
