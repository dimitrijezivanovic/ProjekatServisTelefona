package repositories;

import GrupaC.demo.models.Dekodiranje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DekodiranjeRepository extends JpaRepository<Dekodiranje,Long> {
}
