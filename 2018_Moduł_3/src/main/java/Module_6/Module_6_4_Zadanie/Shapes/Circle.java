package Module_6.Module_6_4_Zadanie.Shapes;

import Module_6.Module_6_4_Zadanie.Shape;

public class Circle implements Shape {

    private double radius;
    private double sourfaceArea;

    public Circle(double radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Rysujemy koło");
    }

    public double sourfaceArea(){
        sourfaceArea = Math.pow(radius, Math.PI);
        return sourfaceArea;
    }

    public double getRadius() {
        return radius;
    }

    public double getSourfaceArea() {
        return sourfaceArea;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", sourfaceArea=" + sourfaceArea +
                '}';
    }
}
