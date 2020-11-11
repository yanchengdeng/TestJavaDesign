package com.design.test.observe;

public class TestObserver {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexObserver(subject);
        subject.setStatus(10);


    }
}
