package tn.esprit.examenblanc.repository;

import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.entity.Niveau;
import tn.esprit.examenblanc.entity.Utilisateur;

@Repository


public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    @Query("SELECT count(u) from Utilisateur u where u.classe.niveau  =: niveau ")
    int nbreUtilisateur(Niveau niveau);
}
