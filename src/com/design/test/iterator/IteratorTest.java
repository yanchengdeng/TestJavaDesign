package com.design.test.iterator;

public class IteratorTest {
    public static void main(String[] args) {

        NamesRepository namesIterator = new NamesRepository();

        Iterator iterator = namesIterator.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
