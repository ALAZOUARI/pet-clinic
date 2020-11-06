package tuto.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tuto.springframework.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
