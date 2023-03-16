package com.example.practicaSpring;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetingService {

    RestTemplate restTemplate = new RestTemplate();

    public InstalacionsDades[] getInstalacionsDades(){
        InstalacionsDades[] dades = restTemplate.getForObject("https://analisi.transparenciacatalunya.cat/resource/nw5s-4ixa.json", InstalacionsDades[].class);
        return dades;
    }
}
