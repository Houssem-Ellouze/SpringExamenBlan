package tn.esprit.examenblanc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.entity.Classe;
@Repository
public interface ClasseRepository extends JpaRepository <Classe, Integer>{
}
