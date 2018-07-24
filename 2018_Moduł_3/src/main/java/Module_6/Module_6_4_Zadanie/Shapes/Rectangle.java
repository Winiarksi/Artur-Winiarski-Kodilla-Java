package Module_6.Module_6_4_Zadanie.Shapes;


import Module_6.Module_6_4_Zadanie.Shape;

public class Rectangle implements Shape {

    private double a;
    private double b;
    private double sourfaceArea;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public void draw(){
        System.out.println("Rysujemy prostokąt" );
    }

    public double sourfaceArea() {
        sourfaceArea =  a * b;
        return sourfaceArea;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", sourfaceArea=" + sourfaceArea +
                '}';
    }
}
