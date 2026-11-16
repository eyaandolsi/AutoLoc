
package tn.esprit.autoloc.autoloc_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.autoloc.autoloc_api.domain.Agence;
import tn.esprit.autoloc.autoloc_api.domain.Equipement;
import tn.esprit.autoloc.autoloc_api.domain.Vehicule;

import tn.esprit.autoloc.autoloc_api.repository.AgenceRepository;
import tn.esprit.autoloc.autoloc_api.repository.EquipementRepository;
import tn.esprit.autoloc.autoloc_api.repository.VehiculeRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehiculeService implements IVehiculeService {

    final VehiculeRepository VRepo;
    final AgenceRepository agenceRepository;
    final EquipementRepository equipementRepository;

    @Override
    public List<Vehicule> retrieveAllVehicules() {
        return (List<Vehicule>) VRepo.findAll();
    }

    @Override
    public Vehicule addVehicule(Vehicule v) {
        return VRepo.save(v);
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {
        return VRepo.save(v);
    }

    @Override
    public Vehicule retrieveVehicule(Long idVehicule) {
        return VRepo.findById(idVehicule).orElse(null);
    }

    @Override
    public void removeVehicule(Long idVehicule) {
        VRepo.deleteById(idVehicule);
    }

    @Override
    public List<Vehicule> addVehicules(List<Vehicule> vehicules) {
        return (List<Vehicule>) VRepo.saveAll(vehicules);
    }

    // Affecter un véhicule à une agence
    @Override
    @Transactional
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence) {
        Vehicule vehicule = VRepo.findById(idVehicule).get();
        Agence agence = agenceRepository.findById(idAgence).get();

        vehicule.setAgence(agence);

        return VRepo.save(vehicule);
    }

    // Affecter un équipement à un véhicule
    @Override
    @Transactional
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = VRepo.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();

        vehicule.getEquipements().add(equipement);

        return VRepo.save(vehicule);
    }

    // Désaffecter un équipement
    @Override
    @Transactional
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = VRepo.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();

        vehicule.getEquipements().remove(equipement);

        return VRepo.save(vehicule);
    }

    // Scénario 1 : rechercher par marque
    @Override
    public List<Vehicule> getVehiculesByMarque(String marque) {
        return VRepo.findByMarque(marque);
    }

    // Scénario 2 : rechercher par catégorie
    @Override
    public List<Vehicule> getVehiculesByCategorie(String categorie) {
        return VRepo.findByCategorie(categorie);
    }

    // Scénario 3 : rechercher par statut
    @Override
    public List<Vehicule> getVehiculesByStatut(String statut) {
        return VRepo.findByStatut(statut);
    }

    // Scénario 8 : rechercher par tarif supérieur à une valeur
    @Override
    public List<Vehicule> getVehiculesByTarif(Double tarif) {
        return VRepo.findByTarifJournalierGreaterThan(tarif);
    }

    // Scénario 11 : rechercher par marque ET statut
    @Override
    public List<Vehicule> getVehiculesByMarqueAndStatut(
            String marque, String statut) {

        return VRepo.findByMarqueAndStatut(marque, statut);
    }
}
