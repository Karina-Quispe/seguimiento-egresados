package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.TipoMantenimiento;
import pe.gob.ministeriopublico.backend.repository.TipoMantenimientoRepository;

@Service
public class TipoMantenimientoService {

    private final TipoMantenimientoRepository repository;

    public TipoMantenimientoService(TipoMantenimientoRepository repository) {
        this.repository = repository;
    }

    public List<TipoMantenimiento> findAll() {
        return repository.findAll();
    }

    public Optional<TipoMantenimiento> findById(Integer id) {
        return repository.findById(id);
    }

    public TipoMantenimiento save(TipoMantenimiento entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
