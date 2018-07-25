package Module_6_5.Stub;

import Module_6.Module_6_5_Mockito.Temperatures;
import Module_6.Module_6_5_Mockito.TemperaturesStub;
import Module_6.Module_6_5_Mockito.WeatherForecast;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherForecastTestSuite {

    @Test
    public void testCalculateForecastWithStub(){
        // Given
        Temperatures temperatures =  new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        // When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        // Then
        assertEquals(5, quantityOfSensors);
    }

}
