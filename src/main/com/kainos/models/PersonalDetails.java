package com.kainos.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;

@Builder
@Getter
@AllArgsConstructor
@ToString
public class PersonalDetails {

    private String firstName;
    private String lastName;
    private String address;
    private LocalDate dateOfBirth;

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "PersonalDetails(" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", address=" + address +
                ", age=" + getAge() +
                ", dateOfBirth=" + dateOfBirth +
                ')';
    }
}