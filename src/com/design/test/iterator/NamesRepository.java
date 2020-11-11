package com.design.test.iterator;

public class NamesRepository  implements  Container{


    public String[] names = {"hello","world","!"};
    @Override
    public Iterator getIterator() {
        return new NamesIterator();
    }


    class NamesIterator implements  Iterator{

        int i ;

        @Override
        public boolean hasNext() {
             return i < names.length;
        }

        @Override
        public Object next() {
            return names[i++];
        }
    }
}
