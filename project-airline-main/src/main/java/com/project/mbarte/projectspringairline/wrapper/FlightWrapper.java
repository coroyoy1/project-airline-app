package com.project.mbarte.projectspringairline.wrapper;

import java.util.List;

import com.project.mbarte.projectspringairline.model.FlightModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlightWrapper {

    private List<FlightModel> response;
    
}
