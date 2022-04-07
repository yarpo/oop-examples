package com.kainos.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonalDetailsTest {

    public static final String TEST_FIRST_NAME = "Johnny";
    public static final String TEST_LAST_NAME = "Rambo";
    public static final String TEST_ADDRESS = "London Road";
    public static final int TEST_AGE = 30;
    public static final LocalDate TEST_DATE_OF_BIRTH = LocalDate.now().minusYears(TEST_AGE);

    @Test
    void allValuesShouldBeValid() {
        PersonalDetails details = new PersonalDetails(
                TEST_FIRST_NAME,
                TEST_LAST_NAME,
                TEST_ADDRESS,
                TEST_AGE,
                TEST_DATE_OF_BIRTH
        );

        assertEquals(TEST_FIRST_NAME, details.getFirstName());
        assertEquals(TEST_LAST_NAME, details.getLastName());
        assertEquals(TEST_ADDRESS, details.getAddress());
        assertEquals(TEST_DATE_OF_BIRTH, details.getDateOfBirth());
        assertEquals(TEST_AGE, details.getAge());
    }

    @Test
    void getFirstNameShouldReturnValidValueWhenOnlyFirstNameSetUsingBuilder() {
        PersonalDetails.PersonalDetailsBuilder builder = PersonalDetails.builder();
        builder.setFirstName(TEST_FIRST_NAME);

        PersonalDetails details = builder.build();

        assertEquals(TEST_FIRST_NAME, details.getFirstName());
    }

    @Test
    void allValuesShouldBeValidUsingBuilder() {
        PersonalDetails.PersonalDetailsBuilder builder = PersonalDetails.builder();
        builder.setFirstName(TEST_FIRST_NAME);
        builder.setLastName(TEST_LAST_NAME);
        builder.setAddress(TEST_ADDRESS);
        builder.setAge(TEST_AGE);
        builder.setDateOfBirth(TEST_DATE_OF_BIRTH);

        PersonalDetails details = builder.build();

        assertEquals(TEST_FIRST_NAME, details.getFirstName());
        assertEquals(TEST_LAST_NAME, details.getLastName());
        assertEquals(TEST_ADDRESS, details.getAddress());
        assertEquals(TEST_DATE_OF_BIRTH, details.getDateOfBirth());
        assertEquals(TEST_AGE, details.getAge());
    }

    @Test
    void allValuesShouldBeValidUsingBuilderAndChain() {
        PersonalDetails details = PersonalDetails.builder()
                .setFirstName(TEST_FIRST_NAME)
                .setLastName(TEST_LAST_NAME)
                .setAddress(TEST_ADDRESS)
                .setAge(TEST_AGE)
                .setDateOfBirth(TEST_DATE_OF_BIRTH)
                .build();

        assertEquals(TEST_FIRST_NAME, details.getFirstName());
        assertEquals(TEST_LAST_NAME, details.getLastName());
        assertEquals(TEST_ADDRESS, details.getAddress());
        assertEquals(TEST_DATE_OF_BIRTH, details.getDateOfBirth());
        assertEquals(TEST_AGE, details.getAge());
    }
}
