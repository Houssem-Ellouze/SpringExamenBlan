package tn.esprit.examenblanc.service;

import tn.esprit.examenblanc.entity.Classe;
import tn.esprit.examenblanc.entity.CoursClassroom;
import tn.esprit.examenblanc.entity.Utilisateur;

public interface IService {
    Utilisateur ajouterUtilisateur(Utilisateur utilisateur);
    Classe ajouterClasse(Classe c);
    CoursClassroom ajouterCoursClassroom(CoursClassroom cc , Integer codeClasse);
    Classe affecterUserClass(Integer idUtilisateur, Integer codeClasse);
    void deaffectationCoursClassroom(Integer idCours);
    void achieveCoursClassroom();
}
