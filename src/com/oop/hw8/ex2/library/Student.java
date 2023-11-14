package com.oop.hw8.ex2.library;

import java.util.Objects;

public class Student {
    private final String id;
    private final String firstName;
    private final String lastName;

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return String.format("Student[id = %s, first name = %s, last name = %s]", this.id, this.firstName, this.lastName);
    }
}
