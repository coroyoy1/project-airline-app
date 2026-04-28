package com.project.mbarte.projectspringairline.services;

import java.util.List;

import com.project.mbarte.projectspringairline.model.AirlineModel;
import com.project.mbarte.projectspringairline.model.AirportModel;
import com.project.mbarte.projectspringairline.model.FlightModel;

public interface AirlabsService {
    
    public List<AirlineModel> viewAllListOfAirlines();
    public List<AirportModel> viewAllListOfAirports();
    public List<FlightModel> searchSpecificFlight(String dep_iata);
}
