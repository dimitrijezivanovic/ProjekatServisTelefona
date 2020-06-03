
package services;

import GrupaC.demo.models.Oprema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.OpremaRepository;

import java.util.Optional;
import java.util.List;

@Service
public class OpremaService implements IOpremaService {

    @Autowired
    private OpremaRepository opremaRepository;

    @Override
    public Optional<Oprema> findById(Long id)
    {
        return opremaRepository.findById(id);
    }
    public List<Oprema> findAll()
    {
        return this.opremaRepository.findAll();
    }
}