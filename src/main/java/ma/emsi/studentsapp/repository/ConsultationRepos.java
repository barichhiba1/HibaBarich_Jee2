package ma.emsi.studentsapp.repository;

import ma.emsi.studentsapp.entities.Consultation;
import ma.emsi.studentsapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepos extends JpaRepository<Consultation, Long> {
}
