package repositories;

import GrupaC.demo.models.Telefon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefonRepository extends JpaRepository<Telefon, Long> {
}
