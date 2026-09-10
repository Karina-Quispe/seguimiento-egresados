package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.DistritoFiscal;
import pe.gob.ministeriopublico.backend.repository.DistritoFiscalRepository;

@Service
public class DistritoFiscalService {

    private final DistritoFiscalRepository repository;

    public DistritoFiscalService(DistritoFiscalRepository repository) {
        this.repository = repository;
    }

    public List<DistritoFiscal> findAll() {
        return repository.findAll();
    }

    public Optional<DistritoFiscal> findById(Integer id) {
        return repository.findById(id);
    }

    public DistritoFiscal save(DistritoFiscal entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
