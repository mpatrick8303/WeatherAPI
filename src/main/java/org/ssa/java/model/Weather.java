package org.ssa.java.model;

public class Weather
{
    int temp;
    int wind;
    int clouds;
    
    public Weather(int temp, int wind, int clouds)
    {
        this.temp = temp;
        this.wind = wind;
        this.clouds = clouds;
    }

    public int getTemp()
    {
        return temp;
    }

    public void setTemp(int temp)
    {
        this.temp = temp;
    }

    public int getWind()
    {
        return wind;
    }

    public void setWind(int wind)
    {
        this.wind = wind;
    }

    public int getClouds()
    {
        return clouds;
    }

    public void setClouds(int clouds)
    {
        this.clouds = clouds;
    }
    
    
}
