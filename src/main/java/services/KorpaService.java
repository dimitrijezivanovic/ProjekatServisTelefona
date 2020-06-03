package services;

import GrupaC.demo.models.Korpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.KorpaRepository;

import java.util.Optional;
import java.util.List;

@Service
public class KorpaService implements IKorpaService {

    @Autowired
    private KorpaRepository korpaRepository;

    @Override
    public Optional<Korpa> findById(Long id)
    {
        return korpaRepository.findById(id);
    }
    public List<Korpa> findAll()
    {
        return this.korpaRepository.findAll();
    }
}