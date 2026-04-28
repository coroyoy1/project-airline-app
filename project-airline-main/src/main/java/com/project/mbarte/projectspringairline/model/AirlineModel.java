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
public class AirlineModel {

    @JsonProperty("name")
    private String airlineName;

    @JsonProperty("iata_code")
    private String airlineIataCode;

    @JsonProperty("icao_code")
    private String airlineIcaoCode;
    
}
