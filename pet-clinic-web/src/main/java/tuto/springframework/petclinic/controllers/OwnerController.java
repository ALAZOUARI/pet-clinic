package tuto.springframework.petclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tuto.springframework.petclinic.services.OwnerService;

@Controller
public class OwnerController {
    private final OwnerService ownerService ;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"/owners","/owners/","/owners/index"})
    public String listOwners(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index" ;
    }

    @RequestMapping("/owners/find")
    public String findOwners(){
        return "notimplemented";
    }
}
