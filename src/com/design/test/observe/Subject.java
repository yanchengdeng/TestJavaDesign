package com.design.test.observe;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private int status ;
    private List<Observer> observerList = new ArrayList<>();

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
        notifyAllObserver();
    }


    public void addObserver(Observer observer){
        observerList.add(observer);
    }


    public void notifyAllObserver(){
        for (Observer item:observerList){
            item.update();
        }
    }
}
