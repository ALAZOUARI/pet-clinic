package tuto.springframework.petclinic.services.map;

import tuto.springframework.petclinic.model.Owner;
import tuto.springframework.petclinic.services.CrudService;
import tuto.springframework.petclinic.services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractmapService<Owner,Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
