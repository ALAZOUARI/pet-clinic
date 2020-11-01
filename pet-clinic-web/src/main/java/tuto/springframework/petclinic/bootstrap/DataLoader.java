package tuto.springframework.petclinic.bootstrap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tuto.springframework.petclinic.model.*;
import tuto.springframework.petclinic.services.OwnerService;
import tuto.springframework.petclinic.services.PetTypeService;
import tuto.springframework.petclinic.services.SpecialitiesService;
import tuto.springframework.petclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerservice ;
    private final VetService vetservice ;
    private final PetTypeService petTypeService;
    private final SpecialitiesService specialitiesService;
    public DataLoader(OwnerService ownerservice, VetService vetservice, PetTypeService petTypeService, SpecialitiesService specialitiesService){
        this.ownerservice = ownerservice;


        this.vetservice = vetservice;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count==0) {
            loadData();

        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType =petTypeService.save(dog);


        PetType cat= new PetType();
        cat.setName("Cat");
        PetType savedCatPetType =petTypeService.save(dog);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology =specialitiesService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery =specialitiesService.save(surgery);


        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry =specialitiesService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setFirstName("Alaa");
        owner1.setLastName("ZOUARI");
        owner1.setAddress("Rte de Gabes KM 6");
        owner1.setCity("Sfax");
        owner1.setTelephone("345743567");
        ownerservice.save(owner1);
        Pet alapPet =new Pet() ;
        alapPet.setPetType(savedDogPetType);
        alapPet.setOwner(owner1);
        alapPet.setBirthDate(LocalDate.now());
        alapPet.setName("boobi");
        owner1.getPets().add(alapPet);

        Owner owner2 = new Owner();

        owner2.setFirstName("Aloulou");
        owner2.setLastName("ZOUARIiii");
        owner2.setAddress("Rte de Gabes KM 6");
        owner2.setCity("Sfax");
        owner2.setTelephone("345743567");
        ownerservice.save(owner2);

        Pet alaapPet =new Pet() ;
        alaapPet.setPetType(savedCatPetType);
        alaapPet.setOwner(owner2);
        alaapPet.setBirthDate(LocalDate.now());
        alaapPet.setName("boobi");
        owner2.getPets().add(alaapPet);

        System.out.println("Loaded owners ...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Resxx");
        vet1.setLastName("BOOB");
        vet1.getSpecialities().add(savedRadiology);
        vetservice.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("ZRRR");
        vet2.setLastName("BOOBiiesv");
        vet2.getSpecialities().add(savedSurgery);

        vetservice.save(vet2);
        System.out.println("Loaded Vets ...");
    }
}
