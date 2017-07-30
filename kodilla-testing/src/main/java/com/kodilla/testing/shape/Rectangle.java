package com.kodilla.testing.shape;

public class Rectangle implements Shape {
    public String name;
    public double pole;
    public double hypotenuse;
    public double leg1;
    public double leg2;

    public Rectangle( String name, double hypotenuse, double leg1, double leg2  ) {
        this.name = name;
        this.hypotenuse = hypotenuse;
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.pole, pole) != 0) return false;
        if (Double.compare(rectangle.hypotenuse, hypotenuse) != 0) return false;
        if (Double.compare(rectangle.leg1, leg1) != 0) return false;
        if (Double.compare(rectangle.leg2, leg2) != 0) return false;
        return name.equals(rectangle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(pole);
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
        pole = Math.sqrt( p * ( p - leg1 ) * ( p - leg2 ) * ( p - hypotenuse ) );
        return pole;
    }

}