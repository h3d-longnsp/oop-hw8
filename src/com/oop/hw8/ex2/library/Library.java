package com.oop.hw8.ex2.library;

// TODO: change to java.time.localDate
import java.util.Date;

public class Library {
    private final Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        if (rents == null || rents.length == 0) {
            return null; // No rents in the library
        }

        Rent longestRent = rents[0];
        long longestDuration = calculateDuration(longestRent);

        for (int i = 1; i < rents.length; i++) {
            long currentDuration = calculateDuration(rents[i]);
            if (currentDuration > longestDuration) {
                longestDuration = currentDuration;
                longestRent = rents[i];
            }
        }

        return longestRent;
    }

    private long calculateDuration(Rent rent) {
        Date start = rent.getStart();
        Date end = rent.getEnd();
        return end.getTime() - start.getTime();
    }
}
