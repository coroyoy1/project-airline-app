package com.project.mbarte.projectspringairline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.mbarte.projectspringairline.services.AirlabsService;

@Controller
public class AirportController {
    
    private final AirlabsService airlabService;
    public AirportController(AirlabsService airlabsService){
        this.airlabService = airlabsService;
    }

    @GetMapping("/airports")
    public String airportWebpage(Model model) {
        model.addAttribute("airports",this.airlabService.viewAllListOfAirports());
        return "airports";
    }
    


}
