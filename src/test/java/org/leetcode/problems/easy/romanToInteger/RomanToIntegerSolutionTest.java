package org.leetcode.problems.easy.romanToInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerSolutionTest {

    @Test
    void testRomanToInt() {
        var roman = new RomanToIntegerSolution();
        assertEquals(3, roman.romanToInt("III"));
    }

    @Test
    void testRomanToInt2() {
        var roman = new RomanToIntegerSolution();
        assertEquals(4, roman.romanToInt("IV"));
    }

    @Test
    void testRomanToInt3() {
        var roman = new RomanToIntegerSolution();
        assertEquals(9, roman.romanToInt("IX"));
    }

    @Test
    void testRomanToInt4() {
        var roman = new RomanToIntegerSolution();
        assertEquals(10, roman.romanToInt("X"));
    }

    @Test
    void testRomanToInt5() {
        var roman = new RomanToIntegerSolution();
        assertEquals(58, roman.romanToInt("LVIII"));
    }

    @Test
    void testRomanToInt6() {
        var roman = new RomanToIntegerSolution();
        assertEquals(1994, roman.romanToInt("MCMXCIV"));
    }
}