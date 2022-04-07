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

    public static PersonalDetailsBuilder builder() {
        return new PersonalDetailsBuilder();
    }

    public static class PersonalDetailsBuilder {
        private String firstName;
        private String lastName;
        private String address;
        private int age;
        private LocalDate dateOfBirth;

        public PersonalDetails build() {
            return new PersonalDetails(firstName, lastName, address, age, dateOfBirth);
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
    }
}