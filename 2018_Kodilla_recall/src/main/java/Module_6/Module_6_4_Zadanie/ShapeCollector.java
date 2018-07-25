package Module_6.Module_6_4_Zadanie;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    private ArrayList<Shape> listShape = new ArrayList<Shape>();


    public void addFigure(Shape shape){
        listShape.add(shape);
    }

    public void removeFigure(Shape shape){
        if(listShape.contains(shape)){
            listShape.remove(shape);
        }
    }

    public Shape getFigure(int n){
        return listShape.get(n);
    }

    public boolean showFigures(){
        int count = 0;
        for(Shape shape : listShape){
            System.out.println(listShape.get(count++));
        }

        if(count == listShape.size()) return true;
        else return false;
    }

    public Shape getShape() {
        return shape;
    }

    public ArrayList<Shape> getListShape() {
        return listShape;
    }
}
