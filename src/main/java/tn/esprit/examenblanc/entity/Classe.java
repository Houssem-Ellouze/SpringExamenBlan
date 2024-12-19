package tn.esprit.examenblanc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeClasse;
    private String titre;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
   @OneToMany(mappedBy = "classe")
    List<CoursClassroom> coursClassrooms;

}
