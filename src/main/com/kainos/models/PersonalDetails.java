package com.kainos.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder
@Getter
@AllArgsConstructor
public class PersonalDetails {

    private String firstName;
    private String lastName;
    private String address;
    private int age;
    private LocalDate dateOfBirth;

    @Override
    public String toString() {
        return "PersonalDetails(" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", address=" + address +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ')';
    }
}