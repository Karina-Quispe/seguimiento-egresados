package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.EstadoEquipo;
import pe.gob.ministeriopublico.backend.repository.EstadoEquipoRepository;

@Service
public class EstadoEquipoService {

    private final EstadoEquipoRepository repository;

    public EstadoEquipoService(EstadoEquipoRepository repository) {
        this.repository = repository;
    }

    public List<EstadoEquipo> findAll() {
        return repository.findAll();
    }

    public Optional<EstadoEquipo> findById(Integer id) {
        return repository.findById(id);
    }

    public EstadoEquipo save(EstadoEquipo entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
