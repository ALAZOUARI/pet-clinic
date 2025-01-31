package tuto.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;
import tuto.springframework.petclinic.model.Pet;
import tuto.springframework.petclinic.model.PetType;
import tuto.springframework.petclinic.services.PetTypeService;

import java.util.Set;
@Service
public class PetTypeServiceMap extends AbstractmapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(PetType object) {
        super.delete(object);

    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
