package services;

import GrupaC.demo.models.Oprema;

import java.util.Optional;

public interface IOpremaService {
    Optional<Oprema> findById(Long id);
}
