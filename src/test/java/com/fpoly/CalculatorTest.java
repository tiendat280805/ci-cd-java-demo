package com.fpoly;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(6, c.add(2, 3));
    }

    @Test
    void testDivide() {
        Calculator c = new Calculator();
        assertEquals(2, c.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class,
                () -> c.divide(5, 0));
    }
}
