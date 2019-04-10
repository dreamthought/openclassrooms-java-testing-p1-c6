package com.openclassrooms.testing;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {

    Calculator calculatorUnderTest;

    @Before
    public void setup() {
        // Recreate the calculator before each test
        calculatorUnderTest = new Calculator();
    }

    @Test
    public void add_returnsTheSum_OfTwoPositiveNumbers(){
        Double expected = 3.0;
        Double sum = calculatorUnderTest.add(1.0, 2.0);
        assertThat(expected, is(equalTo(sum)));
    }

    @Test
    public void add_returnsTheSum_OfTwoNegativeNumbers(){
        Double expected = -3.0;
        Double sum = calculatorUnderTest.add(-1.0, -2.0);
        assertThat(expected, is(equalTo(sum)));
    }
}
