package com.project.mbarte.projectspringairline.wrapper;

import java.util.List;

import com.project.mbarte.projectspringairline.model.AirlineModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AirlineWrapper {
    
    private List<AirlineModel> response;
}
