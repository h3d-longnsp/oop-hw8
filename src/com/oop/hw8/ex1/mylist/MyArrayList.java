package com.oop.hw8.ex1.mylist;

public class MyArrayList extends MyAbstractList {
    private static final int INITIAL_SIZE = 16;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[INITIAL_SIZE];
        this.size = 0;
    }

    @Override
    public void add(Object obj) {
        if (size >= elements.length - 1) {
            enlarge();
        }

        elements[size++] = obj;
    }

    @Override
    public void add(Object obj, int index) {
        checkBoundaries(index, size);

        if (size >= elements.length - 1) {
            enlarge();
        }

        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = obj;
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, this.size - 1);
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    void enlarge() {
        Object[] temp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
    }
}
