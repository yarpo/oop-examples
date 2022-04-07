package com.kainos.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void areaShouldReturnValidValueWhenLengthIs0() {
        Square square = new Square(0);
        assertEquals(0, square.area());
    }

    @Test
    void areaShouldReturnValidValueWhenLengthIs1() {
        Square square = new Square(1);
        assertEquals(1, square.area());
    }

    @Test
    void areaShouldReturnValidValueWhenLengthIsMoreThan2() {
        Square square = new Square(2);
        assertEquals(4, square.area());
    }

    @Test
    void areaSometimesYouFindOutYourCodeDoesNotHandleAllScenarios() {
        // does it actually make sense?
        Square square = new Square(-2);
        assertEquals(4, square.area());

        // the fact your code compiles and all tests are green doesn't means your code works!
    }
}