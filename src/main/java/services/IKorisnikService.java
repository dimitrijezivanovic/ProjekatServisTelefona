package services;

import GrupaC.demo.models.Korisnik;

import java.util.Optional;

public interface IKorisnikService {
    Optional<Korisnik> findById(Long id);
}
