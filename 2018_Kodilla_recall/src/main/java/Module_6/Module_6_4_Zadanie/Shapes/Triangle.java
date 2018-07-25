package Module_6.Module_6_4_Zadanie.Shapes;

import Module_6.Module_6_4_Zadanie.Shape;

public class Triangle implements Shape {

    private double a;
    private double h;
    private double sourfaceArea;

    public Triangle(double a, double h){
        this.a = a;
        this.h = h;
    }

    public void draw(){
        System.out.println("Rysujemy trójkąt");
    }

    public double sourfaceArea(){
        sourfaceArea =  a * h * 0.5;
        return sourfaceArea;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    public double getSourfaceArea() {
        return sourfaceArea;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", h=" + h +
                ", sourfaceArea=" + sourfaceArea +
                '}';
    }
}
