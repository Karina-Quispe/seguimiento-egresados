package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.TipoPersonal;
import pe.gob.ministeriopublico.backend.repository.TipoPersonalRepository;

@Service
public class TipoPersonalService {

    private final TipoPersonalRepository repository;

    public TipoPersonalService(TipoPersonalRepository repository) {
        this.repository = repository;
    }

    public List<TipoPersonal> findAll() {
        return repository.findAll();
    }

    public Optional<TipoPersonal> findById(Integer id) {
        return repository.findById(id);
    }

    public TipoPersonal save(TipoPersonal entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
