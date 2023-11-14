package com.oop.hw8.ex2.library;

public class Item {
    private String title;
    private int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("Item[title = %s, year = %s]", this.title, this.year);
    }
}
