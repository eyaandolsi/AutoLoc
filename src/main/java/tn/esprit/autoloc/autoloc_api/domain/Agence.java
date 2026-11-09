package tn.esprit.autoloc.autoloc_api.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String ville;

    @Column(nullable = false, length = 100)
    private String adresse;

    @Column(nullable = false, length = 12)
    private String telephone;

    @OneToMany(mappedBy = "agence")
    @JsonIgnore
    private List<Vehicule> vehicules = new ArrayList<>();

    @OneToMany(mappedBy = "agence")
    @JsonIgnore
    private List<Employe> employes = new ArrayList<>();

    // Méthodes utilitaires (synchronisation des deux côtés)
    public void addEmploye(Employe employe) {
        employes.add(employe);
        employe.setAgence(this);
    }

    public void removeEmploye(Employe employe) {
        employes.remove(employe);
        employe.setAgence(null);
    }

    public void addVehicule(Vehicule vehicule) {
        vehicules.add(vehicule);
        vehicule.setAgence(this);
    }

    public void removeVehicule(Vehicule vehicule) {
        vehicules.remove(vehicule);
        vehicule.setAgence(null);
    }
}