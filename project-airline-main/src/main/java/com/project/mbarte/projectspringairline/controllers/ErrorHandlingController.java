package com.project.mbarte.projectspringairline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ErrorHandlingController {

    @GetMapping("/error")
    public String errorHandlingWebpage() {
        return "error";
    }

}
