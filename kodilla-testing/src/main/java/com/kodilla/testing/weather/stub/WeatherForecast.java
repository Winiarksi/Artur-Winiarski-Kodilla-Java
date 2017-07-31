package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

    // obliczenie prognozy pogody na podstawie danych z czujników temperatury
public class WeatherForecast {
    Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public HashMap<Integer, Double> calculateForecast() {

        HashMap<Integer, Double> resultMap = new HashMap<Integer, Double>();

        for( Map.Entry<Integer, Double> temperature : temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            // dodanie 1 stopnia Celsjusza do wartości bieżącej
            // jako tymczasową prognozę pogody
            resultMap.put(temperature.getKey(), temperature.getValue() +1 );
        }
        return resultMap;
    }
}