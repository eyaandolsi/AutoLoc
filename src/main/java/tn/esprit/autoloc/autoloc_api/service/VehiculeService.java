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

    // Scénario 2 : véhicule neuf rattaché à l'agence de Sfax
    @Override
    @Transactional
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence) {
        Vehicule vehicule = VRepo.findById(idVehicule).get();
        Agence agence = agenceRepository.findById(idAgence).get();
        // Côté propriétaire de la relation
        vehicule.setAgence(agence);
        return VRepo.save(vehicule);
    }

    // Scénario 3 : l'agent installe le siège bébé
    @Override
    @Transactional
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = VRepo.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();
        // Côté parent choisi : Vehicule (propriétaire du @JoinTable)
        vehicule.getEquipements().add(equipement);
        return VRepo.save(vehicule);
    }

    // Scénario 3 : l'agent retire le siège bébé au retour
    @Override
    @Transactional
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = VRepo.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();
        // On enlève le fils du parent
        vehicule.getEquipements().remove(equipement);
        return VRepo.save(vehicule);
    }
}