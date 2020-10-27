package tuto.springframework.petclinic.services;

import tuto.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
