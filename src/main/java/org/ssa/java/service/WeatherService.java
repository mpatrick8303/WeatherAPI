package org.ssa.java.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService
{
   
    
    public String getWeather(String zipcode)
    {
        
        final String uri = "http://api.wunderground.com/api/5ed1094ef549d44b/conditions/q/" + zipcode + ".json";
        
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        
        
        
        return result;
    }
    
    public String getForecast(String zipcode)
    {
        
        //final String uri = "http://api.wunderground.com/api/5ed1094ef549d44b/forecast/q/" + zipcode + ".json";
        final String uri = "http://api.wunderground.com/api/5ed1094ef549d44b/forecast/q/21122.json";
        
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        
        
        
        return result;
    }
}

