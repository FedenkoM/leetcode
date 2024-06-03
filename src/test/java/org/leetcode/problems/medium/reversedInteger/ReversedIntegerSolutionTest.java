package org.leetcode.problems.medium.reversedInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedIntegerSolutionTest {

    @Test
    void testReverseInteger() {
        ReversedIntegerSolution solution = new ReversedIntegerSolution();
        int actual = solution.reverse(1234);
        assertEquals(4321, actual);
    }

    @Test
    void testReverseInteger2() {
        ReversedIntegerSolution solution = new ReversedIntegerSolution();
        int actual = solution.reverse(842768);
        assertEquals(867248, actual);
    }

    @Test
    void testReverseInteger3() {
        ReversedIntegerSolution solution = new ReversedIntegerSolution();
        int actual = solution.reverse(-1234);
        assertEquals(-4321, actual);
    }

    @Test
    void testReverseInteger4() {
        ReversedIntegerSolution solution = new ReversedIntegerSolution();
        int actual = solution.reverse(Integer.MAX_VALUE + 1);
        assertEquals(0, actual);
    }

    @Test
    void testReverseInteger5() {
        ReversedIntegerSolution solution = new ReversedIntegerSolution();
        int actual = solution.reverse(Integer.MIN_VALUE - 1);
        assertEquals(0, actual);
    }

}