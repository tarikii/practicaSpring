package com.example.practicaSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(InstalacionsController.CIUDADANIA)
public class InstalacionsController {

    public static final String CIUDADANIA = "/ciudadania";


    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String getCiudadaniaDades(Model model){
        InstalacionsDades[] instalacionsDades = greetingService.getInstalacionsDades();
        model.addAttribute("instalacionsDades",instalacionsDades);
        return "instalacions";
    }
}
