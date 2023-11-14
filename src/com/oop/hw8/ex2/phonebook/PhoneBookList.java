package com.oop.hw8.ex2.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    private ArrayList<Student> phoneBook;

    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.add(student);
    }

    @Override
    public Student searchByFirstName(String name) {
        for (Student student : phoneBook) {
            if (student.getFirstName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String name) {
        for (Student student : phoneBook) {
            if (student.getLastName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phoneNumber) {
        for (Student student : phoneBook) {
            if (student.getPhoneNumber().equals(phoneNumber)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phoneNumber) {
        Student studentToRemove = null;
        for (Student student : phoneBook) {
            if (student.getPhoneNumber().equals(phoneNumber)) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            phoneBook.remove(studentToRemove);
        }
    }
}
