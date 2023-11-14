package com.oop.hw8.ex1.mylist;

public abstract class MyAbstractList implements  MyList {
    void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            strBuilder.append(String.format("[%s]", get(i).toString()));
        }
        return strBuilder.toString();
    }
}
