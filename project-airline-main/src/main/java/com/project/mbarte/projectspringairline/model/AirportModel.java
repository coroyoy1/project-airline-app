package com.project.mbarte.projectspringairline.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class AirportModel {

    @JsonProperty("name")
    private String airportName;

    @JsonProperty("lat")
    private String airportLat;

    @JsonProperty("lng")
    private String airportLong;

    @JsonProperty("iata_code")
    private String airportIataCode;

    @JsonProperty("country_code")
    private String airportCountryCode;
    
}
