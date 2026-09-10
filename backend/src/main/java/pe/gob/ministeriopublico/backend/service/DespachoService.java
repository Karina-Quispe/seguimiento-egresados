package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Despacho;
import pe.gob.ministeriopublico.backend.repository.DespachoRepository;

@Service
public class DespachoService {

    private final DespachoRepository repository;

    public DespachoService(DespachoRepository repository) {
        this.repository = repository;
    }

    public List<Despacho> findAll() {
        return repository.findAll();
    }

    public Optional<Despacho> findById(Integer id) {
        return repository.findById(id);
    }

    public Despacho save(Despacho entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
