package tuto.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tuto.springframework.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
