package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Marca;
import pe.gob.ministeriopublico.backend.repository.MarcaRepository;

@Service
public class MarcaService {

    private final MarcaRepository repository;

    public MarcaService(MarcaRepository repository) {
        this.repository = repository;
    }

    public List<Marca> findAll() {
        return repository.findAll();
    }

    public Optional<Marca> findById(Integer id) {
        return repository.findById(id);
    }

    public Marca save(Marca entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
