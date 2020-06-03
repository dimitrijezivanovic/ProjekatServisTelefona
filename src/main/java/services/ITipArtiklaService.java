package services;

import GrupaC.demo.models.TipArtikla;

import java.util.Optional;

public interface ITipArtiklaService {
    Optional<TipArtikla> findById(Long id);
}
