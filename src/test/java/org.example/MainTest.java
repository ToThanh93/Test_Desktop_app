package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testAddition() {
        assertEquals(5, Main.calculate(2, 3, "+"));
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1, Main.calculate(2, 3, "-"));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, Main.calculate(2, 3, "*"));
    }

    @Test
    public void testDivision() {
        assertEquals(2, Main.calculate(6, 3, "/"));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> Main.calculate(1, 0, "/"));
    }

    @Test
    public void testPower() {
        assertEquals(8, Main.calculate(2, 3, "^"));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(2, Main.calculate(4, 0, "sqrt"));
    }

    @Test
    public void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculate(-1, 0, "sqrt"));
    }

    @Test
    public void testModulus() {
        assertEquals(1, Main.calculate(10, 3, "%"));
    }

    @Test
    public void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculate(10, 3, "invalid"));
    }
}