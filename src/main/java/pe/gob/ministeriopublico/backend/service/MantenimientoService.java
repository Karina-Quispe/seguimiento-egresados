package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Mantenimiento;
import pe.gob.ministeriopublico.backend.repository.MantenimientoRepository;

@Service
public class MantenimientoService {

    private final MantenimientoRepository repository;

    public MantenimientoService(MantenimientoRepository repository) {
        this.repository = repository;
    }

    public List<Mantenimiento> findAll() {
        return repository.findAll();
    }

    public Optional<Mantenimiento> findById(Integer id) {
        return repository.findById(id);
    }

    public Mantenimiento save(Mantenimiento entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
