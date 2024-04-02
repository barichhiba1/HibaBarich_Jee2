package ma.emsi.studentsapp.repository;

import ma.emsi.studentsapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepos extends JpaRepository<Patient, Long>
{
    //Methode de recherche :
    Patient findByNom(String name);
}
