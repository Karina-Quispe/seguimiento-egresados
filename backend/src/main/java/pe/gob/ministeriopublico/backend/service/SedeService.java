package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Sede;
import pe.gob.ministeriopublico.backend.repository.SedeRepository;

@Service
public class SedeService {

    private final SedeRepository repository;

    public SedeService(SedeRepository repository) {
        this.repository = repository;
    }

    public List<Sede> findAll() {
        return repository.findAll();
    }

    public Optional<Sede> findById(Integer id) {
        return repository.findById(id);
    }

    public Sede save(Sede entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
