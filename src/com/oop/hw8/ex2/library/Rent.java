package com.oop.hw8.ex2.library;

import java.util.Date;

public class Rent {
    private final Item item;
    private final Student student;
    private final Date start;
    private final Date end;

    public Rent(Item item, Student student, Date start, Date end) {
        this.item = item;
        this.student = student;
        this.start = start;
        this.end = end;
    }

    public Item getItem() {
        return item;
    }

    public Student getStudent() {
        return student;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "item=" + item +
                ", student=" + student +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
