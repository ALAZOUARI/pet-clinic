package tuto.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tuto.springframework.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
