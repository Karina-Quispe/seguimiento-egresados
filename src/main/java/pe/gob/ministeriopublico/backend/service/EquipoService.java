package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Equipo;
import pe.gob.ministeriopublico.backend.repository.EquipoRepository;

@Service
public class EquipoService {

    private final EquipoRepository repository;

    public EquipoService(EquipoRepository repository) {
        this.repository = repository;
    }

    public List<Equipo> findAll() {
        return repository.findAll();
    }

    public Optional<Equipo> findById(Integer id) {
        return repository.findById(id);
    }

    public Equipo save(Equipo entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
