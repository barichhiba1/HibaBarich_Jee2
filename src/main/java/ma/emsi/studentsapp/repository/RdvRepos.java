package ma.emsi.studentsapp.repository;

import ma.emsi.studentsapp.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RdvRepos extends JpaRepository<RendezVous, Long> {
}
