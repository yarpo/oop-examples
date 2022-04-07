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
}
