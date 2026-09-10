package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Modelo;
import pe.gob.ministeriopublico.backend.repository.ModeloRepository;

@Service
public class ModeloService {

    private final ModeloRepository repository;

    public ModeloService(ModeloRepository repository) {
        this.repository = repository;
    }

    public List<Modelo> findAll() {
        return repository.findAll();
    }

    public Optional<Modelo> findById(Integer id) {
        return repository.findById(id);
    }

    public Modelo save(Modelo entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
