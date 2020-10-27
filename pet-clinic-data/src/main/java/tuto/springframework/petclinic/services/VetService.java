package tuto.springframework.petclinic.services;

import tuto.springframework.petclinic.model.Owner;
import tuto.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet) ;
    Set<Vet> findAll();
}
