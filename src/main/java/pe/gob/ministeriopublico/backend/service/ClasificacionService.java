package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Clasificacion;
import pe.gob.ministeriopublico.backend.repository.ClasificacionRepository;

@Service
public class ClasificacionService {

    private final ClasificacionRepository repository;

    public ClasificacionService(ClasificacionRepository repository) {
        this.repository = repository;
    }

    public List<Clasificacion> findAll() {
        return repository.findAll();
    }

    public Optional<Clasificacion> findById(Integer id) {
        return repository.findById(id);
    }

    public Clasificacion save(Clasificacion entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
