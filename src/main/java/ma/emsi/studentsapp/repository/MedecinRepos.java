package ma.emsi.studentsapp.repository;

import ma.emsi.studentsapp.entities.Medecin;
import ma.emsi.studentsapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepos
        extends JpaRepository<Medecin, Long> {
    Medecin findByNom(String nom);
}
