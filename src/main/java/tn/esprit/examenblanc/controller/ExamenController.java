package tn.esprit.examenblanc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenblanc.entity.Classe;
import tn.esprit.examenblanc.entity.Niveau;
import tn.esprit.examenblanc.entity.Utilisateur;
import tn.esprit.examenblanc.service.IService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controller")
@AllArgsConstructor
public class ExamenController {

    //http://localhost:8089/examenBlanc/swagger-ui/index.html#/

    private IService service;

    @PostMapping("/ajouterUtilisateur")
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur){
        return service.ajouterUtilisateur(utilisateur);
    }
    @PostMapping("/ajouterClasse")
    public Classe ajouterClasse(@RequestBody Classe c){
        return service.ajouterClasse(c);
    }

    @PostMapping("/affecterUserClass/{idUtilisateur}/{codeC}")
    public Classe affecterUserClass(@PathVariable Integer idUtilisateur , @PathVariable Integer codeC) {
        return service.affecterUserClass ( idUtilisateur , codeC );
    }
    @GetMapping("/nbreUtilisateur")
    public int nbreUtilisateur(@RequestBody Niveau nv){
        return nbreUtilisateur ( nv );
    }
    @PostMapping("/deaffectationCoursClassroom/{idCours}")
    public void deaffectationCoursClassroom(@PathVariable Integer idCours){
        service.deaffectationCoursClassroom ( idCours );
    }
    @GetMapping("/achieveCoursClassroom")
    void achieveCoursClassroom(){
        service.achieveCoursClassroom();
    }


}
