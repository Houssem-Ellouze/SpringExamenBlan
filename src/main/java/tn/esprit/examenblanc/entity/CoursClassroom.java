package tn.esprit.examenblanc.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CoursClassroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCours;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private String nom;
    private int nbHeures;
    private Boolean archive;
    @ManyToOne
    private Classe classe;
}
