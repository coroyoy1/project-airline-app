package com.project.mbarte.projectspringairline.wrapper;

import java.util.List;

import com.project.mbarte.projectspringairline.model.AirportModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AirportWrapper {
    
    private List<AirportModel> response;

}
