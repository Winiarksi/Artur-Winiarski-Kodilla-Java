package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    //public Shape shape;
    ArrayList<Shape> shapeList = new ArrayList<Shape>;

    public ShapeCollector( /*Shape shape */) {
        //this.shape = shape;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
     Shape theShape = null;
     if ( n >= 0 && n < shapeList.size() ) {
         theShape = shapeList.get( n );
     }
     return theShape;
    }

    public void showFigures(){
        for (Shape shape : shapeList ) {
            System.out.print(shape);
        }
    }
}
