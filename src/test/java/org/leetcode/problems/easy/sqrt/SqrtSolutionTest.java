package org.leetcode.problems.easy.sqrt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtSolutionTest {

    @Test
    void testSqrt() {
        SqrtSolution solution = new SqrtSolution();
        int actualResult = solution.mySqrt(8);
        assertEquals(2, actualResult);
    }
}