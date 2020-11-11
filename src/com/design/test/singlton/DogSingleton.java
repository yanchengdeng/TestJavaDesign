package com.design.test.singlton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 */
public class DogSingleton {

    private  static volatile DogSingleton dogSingleton ;

    private DogSingleton(){

    }


    public static DogSingleton getInstance(){
        if(dogSingleton == null){
            synchronized(DogSingleton.class){
                if(dogSingleton == null){
                    dogSingleton = new DogSingleton();
                }
            }
        }

        return dogSingleton;
    }

   
}
