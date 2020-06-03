package repositories;

import GrupaC.demo.models.Korpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KorpaRepository extends JpaRepository<Korpa, Long> {
}
