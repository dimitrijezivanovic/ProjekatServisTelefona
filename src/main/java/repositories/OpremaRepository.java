package repositories;

import GrupaC.demo.models.Oprema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpremaRepository extends JpaRepository<Oprema, Long> {
}
