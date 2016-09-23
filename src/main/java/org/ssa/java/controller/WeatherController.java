package org.ssa.java.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ssa.java.service.WeatherService;

@Controller
@RequestMapping(value = "/weather")
public class WeatherController
{
    @Autowired 
    WeatherService weatherService;

    @RequestMapping(value = {"","/"})
    public String home()
    {
        return "WeatherAng.html";
   
    }
    
    @RequestMapping(value = "{zipcode}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    @ResponseBody
    public List<String> getWeather(@PathVariable String zipcode)
    {
        List<String> results = new ArrayList();
        weatherService = new WeatherService();
        
        results.add(weatherService.getWeather(zipcode));
        results.add(weatherService.getForecast(zipcode));
        
        return results;
    }
}
