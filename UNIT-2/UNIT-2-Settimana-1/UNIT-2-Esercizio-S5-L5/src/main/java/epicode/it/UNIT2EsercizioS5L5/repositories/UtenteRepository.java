package epicode.it.UNIT2EsercizioS5L5.repositories;


import epicode.it.UNIT2EsercizioS5L5.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente,Integer> {
}
