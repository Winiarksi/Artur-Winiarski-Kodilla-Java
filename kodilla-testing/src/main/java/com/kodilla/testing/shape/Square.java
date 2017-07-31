package com.kodilla.testing.shape;

public class Square implements Shape {
    public String name;
    public double surfaceArea;
    public double a;

    public Square(String name, double a ) {
        this.name = name;
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.surfaceArea, surfaceArea) != 0) return false;
        if (Double.compare(square.a, a) != 0) return false;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(surfaceArea);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName(){

        return name;
    }

    @Override
    public Double getField(){
        surfaceArea = a * a;
        return surfaceArea;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", a=" + a +
                '}';
    }
}
