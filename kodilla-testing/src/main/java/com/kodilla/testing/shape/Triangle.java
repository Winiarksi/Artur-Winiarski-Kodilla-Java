package com.kodilla.testing.shape;

public class Triangle implements Shape {
    public String name;
    public double surfaceArea;
    public double hypotenuse;
    public double leg1;
    public double leg2;

    public Triangle(String name, double hypotenuse, double leg1, double leg2  ) {
        this.name = name;
        this.hypotenuse = hypotenuse;
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.surfaceArea, surfaceArea) != 0) return false;
        if (Double.compare(triangle.hypotenuse, hypotenuse) != 0) return false;
        if (Double.compare(triangle.leg1, leg1) != 0) return false;
        if (Double.compare(triangle.leg2, leg2) != 0) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(surfaceArea);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(hypotenuse);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(leg1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(leg2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName(){
        return name;
    }

    @Override
    public Double getField(){
        double p;
        p = ( leg1 + leg2 + hypotenuse )/2;
        surfaceArea = Math.sqrt( p * ( p - leg1 ) * ( p - leg2 ) * ( p - hypotenuse ) );
        return surfaceArea;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", hypotenuse=" + hypotenuse +
                ", leg1=" + leg1 +
                ", leg2=" + leg2 +
                '}';
    }
}