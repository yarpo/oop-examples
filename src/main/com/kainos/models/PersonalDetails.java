package com.kainos.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Builder
@Getter
@AllArgsConstructor
@ToString
public class PersonalDetails {

    private String firstName;
    private String lastName;
    private String address;
    private int age;
    private LocalDate dateOfBirth;
}