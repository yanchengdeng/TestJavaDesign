package com.design.test.factory;

public class TestDemo {
    
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeFactory.CIRCLE);
        shape.draw();
    }
}
