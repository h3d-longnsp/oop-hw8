package com.oop.hw8.ex2.phonebook;

public class TestMain {
    public static void main(String[] args) {
        //PhoneBookMap phoneBook = new PhoneBookMap();

        PhoneBookList phoneBook = new PhoneBookList();

        phoneBook.addPerson(new Student("Long", "Nguyen", "031245670"));
        phoneBook.addPerson(new Student("Hong", "Do", "045679814"));
        phoneBook.addPerson(new Student("Huong", "Thu", "098712342"));
        phoneBook.addPerson(new Student("Huyen", "Minh", "064983017"));

        System.out.println(phoneBook.searchByLastName("Nguyen"));
        System.out.println(phoneBook.searchByFirstName("Hong"));
        System.out.println(phoneBook.searchByNumber("064983018"));

        System.out.println(phoneBook.searchByLastName("Minh"));
        phoneBook.deleteByNumber("064983017");
        System.out.println(phoneBook.searchByFirstName("Huyen"));
    }
}
