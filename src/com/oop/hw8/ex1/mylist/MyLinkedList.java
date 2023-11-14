package com.oop.hw8.ex1.mylist;

/*
 * Implementation of a simplified LinkedList class
 */
public class MyLinkedList extends MyAbstractList{
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current;
    }


    @Override
    public void add(Object obj) {
        add(obj, size);
    }

    @Override
    public void add(Object obj, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(obj, head);
        }
        else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(obj, current.getNext()));
        }
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(current.getNext().getNext());
        }
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        MyLinkedListNode node = getNodeByIndex(index);
        return node.getPayload();
    }

    @Override
    public int size() {
        return size;
    }
}
