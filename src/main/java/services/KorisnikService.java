package services;

import GrupaC.demo.models.Korisnik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.KorisnikRepository;

import java.util.Optional;
import java.util.List;

@Service
public class KorisnikService implements IKorisnikService {

    @Autowired
    private KorisnikRepository korisnikRepository;

    @Override
    public Optional<Korisnik> findById(Long id)
    {
        return korisnikRepository.findById(id);
    }
    public List<Korisnik> findAll()
    {
        return this.korisnikRepository.findAll();
    }
}