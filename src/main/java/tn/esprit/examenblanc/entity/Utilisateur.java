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
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUtilisateur;
    private String nom;
    private String prenom;
    private String password;
    @ManyToOne
    private Classe classe;

}
