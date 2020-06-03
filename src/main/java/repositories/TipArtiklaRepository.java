package repositories;

import GrupaC.demo.models.TipArtikla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipArtiklaRepository extends JpaRepository<TipArtikla, Long> {
}
