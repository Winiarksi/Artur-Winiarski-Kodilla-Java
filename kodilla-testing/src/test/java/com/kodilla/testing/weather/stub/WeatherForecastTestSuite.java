package com.kodilla.testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();  // tworzymy zaslepke ( stub ), bo nie mamy z tej kl danych
        // Temperatures temperatures = new TemperaturesStub(); ?? zapis ??
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        System.out.println(quantityOfSensors);
        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}