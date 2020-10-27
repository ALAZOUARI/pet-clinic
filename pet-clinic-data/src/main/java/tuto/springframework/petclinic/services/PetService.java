package tuto.springframework.petclinic.services;

import tuto.springframework.petclinic.model.Owner;
import tuto.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet) ;
    Set<Pet> findAll();
}
