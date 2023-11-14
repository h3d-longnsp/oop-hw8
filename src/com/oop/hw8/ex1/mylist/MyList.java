package com.oop.hw8.ex1.mylist;

public interface MyList {
    void add(Object obj);
    void add(Object obj, int index);
    void remove(int index);
    Object get(int index);
    int size();
}
