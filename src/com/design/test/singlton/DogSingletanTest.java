package com.design.test.singlton;

public class DogSingletanTest{
    public static void main(String[] args) {


            Produce produce = new Produce();
            produce.run();


        SingletanEnum singletanEnum = SingletanEnum.INSTANCE;
        singletanEnum.whateverMathod();
    }
}