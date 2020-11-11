package com.design.test.observe;

public class BinaryObserver extends Observer {


    public  BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("Binary String:"+Integer.toBinaryString(this.subject.getStatus()));

    }
}
