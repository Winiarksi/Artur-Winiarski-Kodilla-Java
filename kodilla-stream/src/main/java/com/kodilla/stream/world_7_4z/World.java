package com.kodilla.stream.world_7_4z;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {

    private final Set<Continent> continents = new HashSet<>();

    public World() {
    }

    public Set<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(ct -> ct.getCountries().stream())
                .map(cnt -> cnt.getPeople()) // getName
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }

}
