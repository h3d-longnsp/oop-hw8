package com.oop.hw8.ex1.mylist;

public class TestMain {
    public static void main(String[] args) {
        MyList myArrayList = new MyArrayList();
        myArrayList.add("a", 0);
        myArrayList.add("b");
        myArrayList.add("c", 0);
        myArrayList.add("d", 3);
        System.out.println(myArrayList);
        myArrayList.remove(3);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());

        MyList myLinkedList = new MyLinkedList();
        myLinkedList.add("cat");
        myLinkedList.add("dog");
        myLinkedList.add("bird");
        System.out.println("List: " + myLinkedList);
        myLinkedList.add("orange", 1);
        myLinkedList.add("apple", 0);
        System.out.println("Modified List: " + myLinkedList);
        myLinkedList.remove(2);
        System.out.println("Final List: " + myLinkedList);
        System.out.println("Element at index 0: " + myLinkedList.get(0));
        System.out.println("Element at index 2: " + myLinkedList.get(2));

        System.out.println("Size of the list: " + myLinkedList.size());
    }
}
