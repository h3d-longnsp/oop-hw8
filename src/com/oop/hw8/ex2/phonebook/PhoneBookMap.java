package com.oop.hw8.ex2.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    private HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        this.phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.put(student.getPhoneNumber(), student);
    }

    @Override
    public Student searchByFirstName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.getFirstName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.getLastName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phoneNumber) {
        return phoneBook.get(phoneNumber);
    }

    @Override
    public void deleteByNumber(String phoneNumber) {
        phoneBook.remove(phoneNumber);
    }
}
