package tuto.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tuto.springframework.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
