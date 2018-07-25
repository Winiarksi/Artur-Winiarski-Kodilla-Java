package Module_6.Module_6_5_Mockito;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {

    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<Integer,Double>();
        stubResult.put(0, 25.59);
        stubResult.put(1, 26.43);
        stubResult.put(2, 24.75);
        stubResult.put(3, 26.45);
        stubResult.put(4, 27.56);

        return stubResult;
    }
}
