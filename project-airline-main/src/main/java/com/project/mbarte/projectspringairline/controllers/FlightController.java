package com.project.mbarte.projectspringairline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.mbarte.projectspringairline.services.AirlabsService;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FlightController {

    private final AirlabsService airlabsService;
    public FlightController(AirlabsService airlabsService){
        this.airlabsService = airlabsService;
    }

    @GetMapping("/searchFlight")
    public String searchFlight(@RequestParam String dep_iata, Model model) {
        model.addAttribute("flights",  this.airlabsService.searchSpecificFlight(dep_iata));
        return "flights";
    }

    @GetMapping("/flights")
    public String getFlights() {
        return "flights";
    }
    
}
