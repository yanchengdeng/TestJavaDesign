package com.design.test.observe;

public class HexObserver extends  Observer {


    public HexObserver(Subject subject){
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(" Hex string :"+ Integer.toHexString(this.subject.getStatus()));
    }
}
