package services;

import GrupaC.demo.models.Telefon;

import java.util.Optional;

public interface ITelefonService {

    Optional<Telefon> findById(Long id);
}
