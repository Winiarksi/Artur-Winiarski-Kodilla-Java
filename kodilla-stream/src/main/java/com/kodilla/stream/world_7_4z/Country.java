package com.kodilla.stream.world_7_4z;

import java.math.BigDecimal;

public class Country {
    private final String nameCountry;
    private final BigDecimal populationCountry;

    public Country(String nameCountry, BigDecimal populationCountry) {
        this.nameCountry = nameCountry;
        this.populationCountry = populationCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public BigDecimal getPeople() {
        return populationCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", populationCountry=" + populationCountry +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return nameCountry.equals(country.nameCountry);
    }

    @Override
    public int hashCode() {
        return nameCountry.hashCode();
    }
}

