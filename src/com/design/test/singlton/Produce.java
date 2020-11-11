package com.design.test.singlton;

public class Produce implements Runnable {

    @Override
    public void run() {
        DogSingleton  dogSingleton = DogSingleton.getInstance();
        System.out.println(dogSingleton);
    }
}
