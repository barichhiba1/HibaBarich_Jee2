package ma.emsi.studentsapp.Web;

import ma.emsi.studentsapp.entities.Patient;
import ma.emsi.studentsapp.repository.PatientRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Controlleur qui permet de consulter la liste des patients

@RestController
public class PatientRestController {
    @Autowired
    private PatientRepos pt;

    @GetMapping("/patients")
    public List<Patient> listeP(){
        return pt.findAll();
    }
}
