package com.design.test.factory;


public class ShapeFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";


    public static Shape getShape(String type){
        Shape shape ;
        if(type == null){
            shape = null;
        }else if(type.equals(CIRCLE)){
            shape = new Circle();
        }else if (type.equals(SQUARE)){
            shape = new Square();
        }else {
            shape = new OtherShape();
        }
        return shape;

    }
}
