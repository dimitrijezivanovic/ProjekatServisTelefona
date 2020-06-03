package services;

import GrupaC.demo.models.TipArtikla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.TipArtiklaRepository;

import java.util.Optional;
import java.util.List;

@Service
public class TipArtiklaService implements ITipArtiklaService {

    @Autowired
    private TipArtiklaRepository tipArtiklaRepository;

    @Override
    public Optional<TipArtikla> findById(Long id)
    {
        return tipArtiklaRepository.findById(id);
    }
    public List<TipArtikla> findAll()
    {
        return this.tipArtiklaRepository.findAll();
    }
}