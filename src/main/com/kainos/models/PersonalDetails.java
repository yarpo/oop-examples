package com.kainos.models;

import java.time.LocalDate;

public class PersonalDetails {

    private String firstName;
    private String lastName;
    private String address;
    private int age;
    private LocalDate dateOfBirth;

    public PersonalDetails(String firstName, String lastName, String address, int age, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}