package tuto.springframework.petclinic.bootstrap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tuto.springframework.petclinic.model.Owner;
import tuto.springframework.petclinic.model.PetType;
import tuto.springframework.petclinic.model.Vet;
import tuto.springframework.petclinic.services.OwnerService;
import tuto.springframework.petclinic.services.PetTypeService;
import tuto.springframework.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerservice ;
    private final VetService vetservice ;
    private final PetTypeService petTypeService;
    public DataLoader(OwnerService ownerservice, VetService vetservice, PetTypeService petTypeService){
        this.ownerservice = ownerservice;


        this.vetservice = vetservice;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType =petTypeService.save(dog);


        PetType cat= new PetType();
        cat.setName("Cat");
        PetType savedCatPetType =petTypeService.save(dog);



        Owner owner1 = new Owner();
        owner1.setFirstName("Alaa");
        owner1.setLastName("ZOUARI");
        ownerservice.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Aloulou");
        owner2.setLastName("ZOUARIiii");
        ownerservice.save(owner2);

        System.out.println("Loaded owners ...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Resxx");
        vet1.setLastName("BOOB");
        vetservice.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("ZRRR");
        vet2.setLastName("BOOBiiesv");
        vetservice.save(vet2);
        System.out.println("Loaded Vets ...");





    }
}
