package com.project.mbarte.projectspringairline.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.project.mbarte.projectspringairline.model.AirlineModel;
import com.project.mbarte.projectspringairline.model.AirportModel;
import com.project.mbarte.projectspringairline.model.FlightModel;
import com.project.mbarte.projectspringairline.wrapper.AirlineWrapper;
import com.project.mbarte.projectspringairline.wrapper.AirportWrapper;
import com.project.mbarte.projectspringairline.wrapper.FlightWrapper;

@Service
public class AirlabsServiceImpl implements AirlabsService{

    private static final String URL = "https://airlabs.co/api/v9/";
    private final RestTemplate restTemplate;
    public AirlabsServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Value("${API_KEY}")
    public String API_KEY;

    @Override
    public List<AirlineModel> viewAllListOfAirlines() {
        UriComponentsBuilder uri = UriComponentsBuilder
            .fromUriString(URL)
            .path("airlines")
            .queryParam("api_key", API_KEY);

        ResponseEntity<AirlineWrapper> response = this.restTemplate.getForEntity(uri.toUriString(), AirlineWrapper.class);   
        AirlineWrapper wrapper = response.getBody();
        return wrapper != null ? wrapper.getResponse() : Collections.emptyList();  
    }

    @Override
    public List<FlightModel> searchSpecificFlight(String dep_iata) {
        UriComponentsBuilder uri = UriComponentsBuilder
                .fromUriString(URL)
                .path("flights")
                .queryParam("api_key", API_KEY)
                .queryParam("dep_iata", dep_iata);

        ResponseEntity<FlightWrapper> response = this.restTemplate.getForEntity(uri.toUriString(), FlightWrapper.class);
        FlightWrapper wrapper = response.getBody();
        return wrapper != null ? wrapper.getResponse() : Collections.emptyList();
    }

    @Override
    public List<AirportModel> viewAllListOfAirports() {
       UriComponentsBuilder uri = UriComponentsBuilder
            .fromUriString(URL)
            .path("airports")
            .queryParam("api_key", API_KEY);

        ResponseEntity<AirportWrapper> response = this.restTemplate.getForEntity(uri.toUriString(), AirportWrapper.class);   
        AirportWrapper wrapper = response.getBody();
        return wrapper != null ? wrapper.getResponse() : Collections.emptyList();
    }
    
}
