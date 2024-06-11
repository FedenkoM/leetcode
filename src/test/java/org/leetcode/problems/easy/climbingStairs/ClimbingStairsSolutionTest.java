package org.leetcode.problems.easy.climbingStairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsSolutionTest {

    @Test
    void testClimbStairs() {
        ClimbingStairsSolution cs = new ClimbingStairsSolution();
        assertEquals(3, cs.climbStairs(3));
    }

    @Test
    void testClimbStairs2() {
        ClimbingStairsSolution cs = new ClimbingStairsSolution();
        assertEquals(2, cs.climbStairs(2));
    }

    @Test
    void testClimbStairs3() {
        ClimbingStairsSolution cs = new ClimbingStairsSolution();
        assertEquals(0, cs.climbStairs(0));
    }

    @Test
    void testClimbStairs4() {
        ClimbingStairsSolution cs = new ClimbingStairsSolution();
        assertEquals(8, cs.climbStairs(5));
    }
}