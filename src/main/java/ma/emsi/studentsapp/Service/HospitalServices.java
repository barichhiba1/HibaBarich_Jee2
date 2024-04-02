package ma.emsi.studentsapp.Service;

import ma.emsi.studentsapp.entities.Consultation;
import ma.emsi.studentsapp.entities.Medecin;
import ma.emsi.studentsapp.entities.Patient;
import ma.emsi.studentsapp.entities.RendezVous;

public interface HospitalServices {

    Patient ajoutPatient(Patient p);
    Medecin ajoutMed(Medecin m);
    RendezVous ajoutRdv(RendezVous rd);
    Consultation ajoutConsultation(Consultation c);



}
