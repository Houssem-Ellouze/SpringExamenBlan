package tn.esprit.examenblanc.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.entity.Classe;
import tn.esprit.examenblanc.entity.CoursClassroom;
import tn.esprit.examenblanc.entity.Niveau;
import tn.esprit.examenblanc.entity.Utilisateur;
import tn.esprit.examenblanc.repository.ClasseRepository;
import tn.esprit.examenblanc.repository.CoursClassroomRepository;
import tn.esprit.examenblanc.repository.UtilisateurRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceImpl implements IService {

    private UtilisateurRepository utilisateurRepository;
    private ClasseRepository classeRepository;
    private CoursClassroomRepository coursClassroomRepository;

    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public Classe ajouterClasse(Classe c) {
        return classeRepository.save(c);
    }

    public CoursClassroom ajouterCoursClassroom(CoursClassroom cc, Integer codeClasse) {
        Classe c = classeRepository.findById(codeClasse).get();
        cc.setClasse(c);
        return coursClassroomRepository.save(cc);
    }
    public Classe affecterUserClass(Integer idUtilisateur, Integer codeClasse) {

        Utilisateur u = utilisateurRepository.findById(idUtilisateur).get();
        Classe c = classeRepository.findById(codeClasse).get();
        u.setClasse(c);

        return c;
    }

    public void deaffectationCoursClassroom(Integer idCours) {
        CoursClassroom cc = coursClassroomRepository.findById(idCours).get();
        if (cc != null) {
            cc.setClasse(null);
        }

    }

    public int nbreUtilisateur(Niveau nv){
        return utilisateurRepository.nbreUtilisateur (nv);
    }
    @Scheduled(cron = "*/59 * * * * *")
    public void achieveCoursClassroom() {

        List<CoursClassroom>  coursClassrooms=coursClassroomRepository.findAll();

        for (CoursClassroom cc : coursClassrooms) {
            if(cc.getArchive () == true) {
                System.out.println ("Archieve is true");
            }
        }
        System.out.println ("Archieve is false");
    }



}
