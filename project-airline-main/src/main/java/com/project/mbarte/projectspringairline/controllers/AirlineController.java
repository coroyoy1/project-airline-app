package com.project.mbarte.projectspringairline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.mbarte.projectspringairline.services.AirlabsService;

@Controller
public class AirlineController {

    private final AirlabsService airlabsService;
    public AirlineController(AirlabsService airlabsService){
        this.airlabsService = airlabsService;
    }
    
    @GetMapping("/airlines")
    public String airlinesWebpage(Model model) {
       model.addAttribute("airlines", this.airlabsService.viewAllListOfAirlines());
        return "airlines";
    }
    

}
