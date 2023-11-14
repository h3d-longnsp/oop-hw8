package com.oop.hw8.ex2.library;

public class Book extends Item {
    private final int pages;

    public Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return String.format("Book[%s, pages = %s]", super.toString(), this.pages);
    }
}
