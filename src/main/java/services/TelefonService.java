package services;

import GrupaC.demo.models.Telefon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.TelefonRepository;

import java.util.Optional;
import java.util.List;

@Service
public class TelefonService implements ITelefonService {

    @Autowired
    private TelefonRepository telefonRepository;

    @Override
    public Optional<Telefon> findById(Long id)
    {
        return telefonRepository.findById(id);
    }
    public List<Telefon> findAll()
    {
        return this.telefonRepository.findAll();
    }
}
