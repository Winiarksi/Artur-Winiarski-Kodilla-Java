package com.kodilla.stream.world_7_4z;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final String name;
    private final Set<Country> countries = new HashSet<>();

    public Continent( final String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Country> getCountries() {
        return countries;
    }
}
