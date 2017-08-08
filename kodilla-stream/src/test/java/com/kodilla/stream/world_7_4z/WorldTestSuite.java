package com.kodilla.stream.world_7_4z;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQty(){

        // Given
        Country poland = new Country("Polska", new BigDecimal("38000000"));
        Country germany = new Country("Niemcy", new BigDecimal("50000000"));
        Country england = new Country("Anglia", new BigDecimal("46000001"));

        Country china = new Country("Chiny", new BigDecimal("1378700000"));
        Country india = new Country("Indie", new BigDecimal("1324200000"));
        Country pakistan = new Country("Pakistan", new BigDecimal("193203500"));

        Country rpa = new Country("RPA", new BigDecimal("55900001"));
        Country sudan = new Country("Sudan", new BigDecimal("39500000"));
        Country kenia = new Country("Kenia", new BigDecimal("48460000"));

        Continent europe = new Continent("Europa");
        Continent asia = new Continent("Azja");
        Continent africa = new Continent("Afryka");

        europe.getCountries().add(poland);
        europe.getCountries().add(germany);
        europe.getCountries().add(england);

        asia.getCountries().add(china);
        asia.getCountries().add(india);
        asia.getCountries().add(pakistan);

        africa.getCountries().add(rpa);
        africa.getCountries().add(sudan);
        africa.getCountries().add(kenia);

        World swiat = new World();
        swiat.getContinents().add(europe);
        swiat.getContinents().add(africa);
        swiat.getContinents().add(asia);

        // When
        BigDecimal qty = swiat.getPeopleQuantity();

        // Then
        Assert.assertEquals(new BigDecimal("3173963502"), qty);
    }

}
