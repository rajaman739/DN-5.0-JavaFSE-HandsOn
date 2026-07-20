package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @RequestMapping("/country")
    public Country getCountryIndia() {
        logger.info("Start: getCountryIndia() method invoked.");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        logger.info("End: getCountryIndia() method completed, returning country.");
        return country;
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        logger.info("Start: getCountry() controller method invoked for code: {}", code);
        Country country = countryService.getCountry(code);
        logger.info("End: getCountry() controller method completed for code: {}", code);
        return country;
    }
}