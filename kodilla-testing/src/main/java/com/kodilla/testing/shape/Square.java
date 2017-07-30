package com.kodilla.testing.shape;

public class Square implements Shape {
    public String name;
    public double surfaceArea;
    public double length;
    public double width;

    public Square(String name, double length, double width  ) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.surfaceArea, surfaceArea) != 0) return false;
        if (Double.compare(square.length, length) != 0) return false;
        if (Double.compare(square.width, width) != 0) return false;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(surfaceArea);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName(){

        return name;
    }

    @Override
    public Double getField(){
        surfaceArea = length * width;
        return surfaceArea;
    }
}
