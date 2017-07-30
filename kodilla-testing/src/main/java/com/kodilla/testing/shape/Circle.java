package com.kodilla.testing.shape;

public class Circle implements Shape {
    public String name;
    public double pole;
    public double r;

    public Circle ( String name, double r ){
        this.name = name;
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.pole, pole) != 0) return false;
        if (Double.compare(circle.r, r) != 0) return false;
        return name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(pole);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName(){
        return name;
    }

    @Override
    public Double getField(){
        pole =  3.14159 * r * r;
        return pole;
    }

}
