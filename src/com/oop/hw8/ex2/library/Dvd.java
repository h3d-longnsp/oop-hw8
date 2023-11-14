package com.oop.hw8.ex2.library;

public class Dvd extends Item {
    private final int duration;

    public Dvd(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return String.format("Dvd[%s, duration = %s]", super.toString(), this.duration);
    }
}
