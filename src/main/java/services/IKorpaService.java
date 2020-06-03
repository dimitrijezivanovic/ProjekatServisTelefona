package services;

import GrupaC.demo.models.Korpa;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface IKorpaService {
Optional<Korpa> findById(Long id);
}
