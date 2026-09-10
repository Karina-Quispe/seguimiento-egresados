package pe.gob.ministeriopublico.backend.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.gob.ministeriopublico.backend.entity.AsignacionEquipo;
import pe.gob.ministeriopublico.backend.service.AsignacionEquipoService;

@RestController
@RequestMapping("/api/asignacion-equipos")
public class AsignacionEquipoController {

    private final AsignacionEquipoService service;

    public AsignacionEquipoController(AsignacionEquipoService service) {
        this.service = service;
    }

    @GetMapping
    public List<AsignacionEquipo> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AsignacionEquipo> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AsignacionEquipo> create(@RequestBody AsignacionEquipo entity) {
        AsignacionEquipo saved = service.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AsignacionEquipo> update(@PathVariable Integer id, @RequestBody AsignacionEquipo entity) {
        if (service.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        entity.setIdAsignacion(id);
        return ResponseEntity.ok(service.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (service.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
