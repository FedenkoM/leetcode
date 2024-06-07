package org.leetcode.problems.easy.addBinary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinarySolutionTest {

    @Test
    void testAddBinary() {
        AddBinarySolution solution = new AddBinarySolution();
        String s1 = "11";
        String s2 = "10";
        assertEquals("101", solution.addBinary(s1, s2));
    }

    @Test
    void testAddBinary2() {
        AddBinarySolution solution = new AddBinarySolution();
        String s1 = "11";
        String s2 = "1";
        assertEquals("100", solution.addBinary(s1, s2));
    }

    @Test
    void testAddBinary3() {
        AddBinarySolution solution = new AddBinarySolution();
        String s1 = "1010";
        String s2 = "1011";
        assertEquals("10101", solution.addBinary(s1, s2));
    }
}