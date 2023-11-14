package com.oop.hw8.ex2.phonebook;

public class Student {
    private final String firstName;
    private final String lastName;
    private String phoneNumber;

    public Student(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return String.format("Student[first name = %s, last name = %s, phone number = %s]", this.firstName, this.lastName, this.phoneNumber);
    }
}
