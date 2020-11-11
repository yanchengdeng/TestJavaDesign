package com.design.test.proxy;

public class ProxyImage implements Image{

    private RealImage realImage;
    private String name;

    public ProxyImage(String fileName){
        this.name = fileName;
    }

    @Override
    public void display() {
        if (realImage ==null){
            realImage = new RealImage(name);
        }

        realImage.display();

    }
}
