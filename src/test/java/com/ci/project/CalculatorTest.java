package com.ci.project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calc.subtract(4, 3), "4 - 3 should equal 1");
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, calc.multiply(3, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2.5, calc.divide(5, 2));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    // Task 3: No hard-coded values using Parameterized tests
    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "5, 5, 10",
            "-1, -1, -2",
            "100, -50, 50"
    })
    public void testParameterizedAddition(int a, int b, int expected) {
        assertEquals(expected, calc.add(a, b));
    }
}
