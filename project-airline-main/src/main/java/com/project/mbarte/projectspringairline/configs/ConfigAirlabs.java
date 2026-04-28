package com.project.mbarte.projectspringairline.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigAirlabs {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
