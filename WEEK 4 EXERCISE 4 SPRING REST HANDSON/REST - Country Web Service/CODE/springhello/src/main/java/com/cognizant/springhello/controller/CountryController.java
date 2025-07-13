package com.cognizant.springhello.controller;

import com.cognizant.springhello.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/country")
    public Country getCountryIndia() {
        Country india = (Country) context.getBean("india");
        return india;
    }
}
