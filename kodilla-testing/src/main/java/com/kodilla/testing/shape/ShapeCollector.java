package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public ShapeCollector() {}

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

    public boolean showFigures(){
        int check = 0;
        for ( int i =0; i < shapeList.size(); i++ ) {
            System.out.println( shapeList.get( i ) );
            check++;
        }

        if ( shapeList.size() == check ){
            return true;
        } else {
            return false;
        }
    }
}
