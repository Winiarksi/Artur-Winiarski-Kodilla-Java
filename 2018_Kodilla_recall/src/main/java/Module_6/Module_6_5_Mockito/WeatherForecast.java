package Module_6.Module_6_5_Mockito;

import Module_6.Module_6_5_Mockito.Temperatures;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {

    Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public HashMap<Integer, Double> calculateForecast() {
        HashMap<Integer, Double> resultMap = new HashMap<Integer, Double>();

        for(Map.Entry<Integer, Double> temperature :
                temperatures.getTemperatures().entrySet()){



            resultMap.put(temperature.getKey(), temperature.getValue() +1);
        }

        return resultMap;
    }
}
