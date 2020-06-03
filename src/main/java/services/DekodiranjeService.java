package services;

import GrupaC.demo.models.Dekodiranje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.DekodiranjeRepository;

import java.util.Optional;
import java.util.List;

@Service
public class DekodiranjeService implements IDekodiranjeService {

    @Autowired
    private DekodiranjeRepository dekodiranjeRepository;

    @Override
    public Optional<Dekodiranje> findById(Long id)
    {
        return dekodiranjeRepository.findById(id);
    }
    public List<Dekodiranje> findAll()
    {
        return this.dekodiranjeRepository.findAll();
    }
}