package com.kainos.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonalDetailsTest {

    public static final String TEST_FIRST_NAME = "Johnny";
    public static final String TEST_LAST_NAME = "Rambo";
    public static final String TEST_ADDRESS = "London Road";
    public static final LocalDate TEST_DATE_OF_BIRTH = LocalDate.now().minusYears(30);
    public static final int TEST_AGE = 70;

    @Test
    void getFirstNameShouldReturnValidValueWhenOnlyFirstNameSetNoBuilder() {
        PersonalDetails personalDetails = new PersonalDetails(
                TEST_FIRST_NAME,
                null,
                null,
                0,
                null
        );

        assertEquals(TEST_FIRST_NAME, personalDetails.getFirstName());
    }

//    @Test
//    void getFirstNameShouldReturnValidValueWhenOnlyFirstNameSetUseBuilder() {
//        PersonalDetails.Builder personalDetailsBuilder = PersonalDetails.builder();
//        personalDetailsBuilder.setFirstName(TEST_FIRST_NAME);
//
//        PersonalDetails details = personalDetailsBuilder.build();
//
//        assertEquals(TEST_FIRST_NAME, details.getFirstName());
//    }

    @Test
    void allValuesShouldBeValid() {
        PersonalDetails details = PersonalDetails.builder()
                .firstName(TEST_FIRST_NAME)
                .lastName(TEST_LAST_NAME)
                .address(TEST_ADDRESS)
                .dateOfBirth(TEST_DATE_OF_BIRTH)
                .age(TEST_AGE)
                .build();

        assertEquals(TEST_FIRST_NAME, details.getFirstName());
        assertEquals(TEST_LAST_NAME, details.getLastName());
        assertEquals(TEST_ADDRESS, details.getAddress());
        assertEquals(TEST_DATE_OF_BIRTH, details.getDateOfBirth());
        assertEquals(TEST_AGE, details.getAge());
    }

//    @Test
//    void testToString() {
//        PersonalDetails.Builder personalDetailsBuilder = PersonalDetails.builder();
//        personalDetailsBuilder.setFirstName(TEST_FIRST_NAME);
//        personalDetailsBuilder.setLastName(TEST_LAST_NAME);
//        personalDetailsBuilder.setAddress(TEST_ADDRESS);
//        personalDetailsBuilder.setDateOfBirth(TEST_DATE_OF_BIRTH);
//        personalDetailsBuilder.setAge(TEST_AGE);
//
//        PersonalDetails details = personalDetailsBuilder.build();
//
//        assertEquals("PersonalDetails{firstName='Johnny', lastName='Rambo', address='London Road', age=70, dateOfBirth=1992-04-04}", details.toString());
//    }
}