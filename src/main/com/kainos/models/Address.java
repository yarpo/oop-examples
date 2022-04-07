package com.kainos.models;

import lombok.ToString;

@ToString
public class Address {

    private String line1;
    private String line2;
    private String postcode;
    private String city;

    public Address(String line1, String line2, String postcode, String city) {
        this.line1 = line1;
        this.line2 = line2;
        this.postcode = postcode;
        this.city = city;
    }
}
