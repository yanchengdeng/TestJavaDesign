package com.design.test.proxy;

public class RealImage implements Image{

    private String fileName;
    public RealImage(String filename){
        this.fileName = filename;
        loadFromDisk(filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("load from disk");
    }

    @Override
    public void display() {
        System.out.println("Real iamge display()");
    }


}
