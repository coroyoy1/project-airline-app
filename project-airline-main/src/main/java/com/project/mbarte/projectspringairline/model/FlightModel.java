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
public class FlightModel {

    @JsonProperty("flight_number")
    private String flightNumber;

    @JsonProperty("airline_iata")
    private String airlineIata;

    @JsonProperty("aircraft_icao")
    private String aircraftIcao;

    @JsonProperty("dep_iata")
    private String depIata;

    @JsonProperty("arr_iata")
    private String arrIata;

    @JsonProperty("departure_time")
    private String departureTime;

    @JsonProperty("arrival_time")
    private String arrivalTime;

    @JsonProperty("status")
    private String status;

}
