package ma.emsi.studentsapp.Service;

import jakarta.transaction.Transactional;
import ma.emsi.studentsapp.entities.Consultation;
import ma.emsi.studentsapp.entities.Medecin;
import ma.emsi.studentsapp.entities.Patient;
import ma.emsi.studentsapp.entities.RendezVous;
import ma.emsi.studentsapp.repository.ConsultationRepos;
import ma.emsi.studentsapp.repository.MedecinRepos;
import ma.emsi.studentsapp.repository.PatientRepos;
import ma.emsi.studentsapp.repository.RdvRepos;
import org.springframework.stereotype.Service;

@Service // couche metier
@Transactional //les operations doivent etre Transactionnelle
public class HospitalServicesImpl implements HospitalServices {

    private PatientRepos pat;
    private MedecinRepos med;
    private ConsultationRepos cons;
    private RdvRepos rdR;

    public HospitalServicesImpl(PatientRepos p, ConsultationRepos c,RdvRepos r,MedecinRepos m) {
        this.pat = p;
        this.med=m;
        this.rdR=r;
        this.cons=c;
    }

    //Injection des dependances soit par constructeur sinon @Autowired pour chaque attribut



    @Override
    public Patient ajoutPatient(Patient p) {
        return pat.save(p);
    }

    @Override
    public Medecin ajoutMed(Medecin m) {
        return med.save(m);
    }

    @Override
    public RendezVous ajoutRdv(RendezVous rd) {
        //rd.setId(UUID.randomUUID().toString()); // random chaine de string qui est unique
        //uuid est un generateur
        return rdR.save(rd);
    }

    @Override
    public Consultation ajoutConsultation(Consultation c) {
        return this.cons.save(c);
    }
}
