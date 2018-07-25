package Module_6_5.Mock;

import Module_6.Module_6_5_Mockito.Temperatures;
import Module_6.Module_6_5_Mockito.WeatherForecast;
import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {

    @Test
    public void testCalculateForecastWithMock() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);

        HashMap<Integer, Double> temperaturesMap = new HashMap<Integer, Double>();
        temperaturesMap.put(0, 24.4);
        temperaturesMap.put(1, 22.8);
        temperaturesMap.put(2, 23.5);
        temperaturesMap.put(3, 25.2);
        temperaturesMap.put(4, 26.9);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}