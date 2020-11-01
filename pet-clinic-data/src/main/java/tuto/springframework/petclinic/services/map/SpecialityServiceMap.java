package tuto.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;
import tuto.springframework.petclinic.model.Speciality;
import tuto.springframework.petclinic.services.SpecialitiesService;

import java.util.Set;
@Service
public class SpecialityServiceMap extends  AbstractmapService<Speciality,Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);

    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
