package com.kodilla.patterns.builder.bigmac_11_5z;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
        private final String roll;
        // burgers: oznaczającą ilość kotletów wołowych w środku kanapki
        private final int burgers;
        // suace: oznaczającą rodzaj użytego sosu
        // (standard, 1000 wysp, barbecue)
        private final ArrayList sauce;
        //ingredients: oznaczającą listę składników dodatkowych
        // (możliwe wartości to: sałata, cebula, bekon,
        // ogórek, papryczki chilli, pieczarki, krewetki, ser)
        private final ArrayList ingredients; // czy to tak ładnie zapisaywać ? :D


    public static class BigmacBuilder{
        private String roll;
        private int burgers;
        private List<String> sauce = new ArrayList<>();
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll){
            this.roll = roll;
            return this;
        }
        public BigmacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder sauce(String sauce){
            this.sauce.add(sauce);
            return this;
        }
        public BigmacBuilder ingredients(String ingredients){
            this.ingredients.add(ingredients); // tu poprawić Mistrza, w materiałach edu nie ma "this."
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String roll, final int burgers, final List<String> sauce, final List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = new ArrayList<String>(sauce);
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public ArrayList getSauce() {
        return sauce;
    }

    public ArrayList getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac: " +
                "roll: " + roll +
                ", burgers sztuk: " + burgers +
                ", sauce: " + sauce + ",\n" +
                " ingredients: " + ingredients +
                '.';
    }
}