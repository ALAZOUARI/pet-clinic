package tuto.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tuto.springframework.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
