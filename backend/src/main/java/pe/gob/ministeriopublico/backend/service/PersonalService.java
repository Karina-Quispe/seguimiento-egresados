package pe.gob.ministeriopublico.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import pe.gob.ministeriopublico.backend.entity.Personal;
import pe.gob.ministeriopublico.backend.repository.PersonalRepository;

@Service
public class PersonalService {

    private final PersonalRepository repository;

    public PersonalService(PersonalRepository repository) {
        this.repository = repository;
    }

    public List<Personal> findAll() {
        return repository.findAll();
    }

    public Optional<Personal> findById(Integer id) {
        return repository.findById(id);
    }

    public Personal save(Personal entity) {
        return repository.save(entity);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
