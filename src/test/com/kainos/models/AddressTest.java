package com.kainos.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void testToString() {
        assertEquals(
                "Address(line1=line1, line2=line2, postcode=80-888, city=Gdańsk)",
                new Address("line1", "line2", "80-888", "Gdańsk").toString()
        );
    }
}