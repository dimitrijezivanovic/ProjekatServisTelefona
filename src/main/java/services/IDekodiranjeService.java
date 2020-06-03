package services;

import GrupaC.demo.models.Dekodiranje;

import java.util.Optional;

public interface IDekodiranjeService {
     Optional<Dekodiranje> findById(Long id);
}

