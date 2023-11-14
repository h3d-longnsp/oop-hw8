package com.oop.hw8.ex2.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestMain {
    public static void main(String[] args) throws ParseException {
        Book item1 = new Book("The Lost Symbol", 2013, 642);
        Dvd item2 = new Dvd("Terminator 2", 1991, 137);
        Dvd item3 = new Dvd("Mission: Impossible - Ghost Protocol", 2011, 133);
        Book item4 = new Book("Digital Fortress", 1998, 516);

        System.out.println(item1);
        System.out.printf("Title: %s\n", item1.getTitle());
        System.out.printf("Year: %s\n", item1.getYear());
        System.out.printf("Pages: %d\n", item1.getPages());
        System.out.println("---");
        System.out.println(item2);
        System.out.printf("Title: %s\n", item2.getTitle());
        System.out.printf("Year: %s\n", item2.getYear());
        System.out.printf("Duration: %d\n", item2.getDuration());

        System.out.println("---");
        Student student1 = new Student("001","Long", "Nguyen");
        Student student2 = new Student("002","Hong", "Do");
        System.out.println(student2);
        System.out.println(student1.getId());
        System.out.println(student1.getLastName());
        System.out.println(student2.getFirstName());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Rent[] rents = new Rent[5];
        rents[0] = new Rent(item1, student1, simpleDateFormat.parse("15-06-2023"), simpleDateFormat.parse("15-07-2023"));
        rents[1] = new Rent(item4, student2, simpleDateFormat.parse("10-07-2023"), simpleDateFormat.parse("20-07-2023"));
        rents[2] = new Rent(item3, student2, simpleDateFormat.parse("28-08-2023"), simpleDateFormat.parse("14-11-2023"));
        rents[3] = new Rent(item1, student1, simpleDateFormat.parse("20-07-2023"), simpleDateFormat.parse("30-07-2023"));
        rents[4] = new Rent(item2, student2, simpleDateFormat.parse("25-08-2023"), simpleDateFormat.parse("28-08-2023"));

        System.out.println("---");
        System.out.println(rents[0]);
        System.out.println(rents[0].getStart());
        System.out.println(rents[0].getEnd());
        System.out.println(rents[0].getStudent());
        System.out.println(rents[0].getItem());

        Library lib1 = new Library(rents);
        System.out.printf("Longest rents: %s", lib1.getLongestRent());
    }
}
