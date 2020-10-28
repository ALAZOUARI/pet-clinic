package tuto.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners","/owners/","/owners/index"})
    public String listOwners(){
        return "owners/index" ;
    }
}
