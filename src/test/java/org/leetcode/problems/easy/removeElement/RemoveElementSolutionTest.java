package org.leetcode.problems.easy.removeElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementSolutionTest {

    @Test
    void removeElement() {
        RemoveElementSolution solution = new RemoveElementSolution();
        int[] nums = {3, 2, 2, 3};
        int result = solution.removeElement(nums, 2);
        assertEquals(2, result);
    }

    @Test
    void removeElement2() {
        RemoveElementSolution solution = new RemoveElementSolution();
        int[] nums = {3, 2, 2, 3};
        int result = solution.removeElement2(nums, 2);
        assertEquals(2, result);
    }

    @Test
    void removeElement3() {
        RemoveElementSolution solution = new RemoveElementSolution();
        int[] nums = {3, 2, 2, 3};
        int result = solution.removeElement2(nums, 1);
        assertEquals(4, result);
    }

    @Test
    void removeElement4() {
        RemoveElementSolution solution = new RemoveElementSolution();
        int[] nums = {};
        int result = solution.removeElement2(nums, 1);
        assertEquals(0, result);
    }

    @Test
    void removeElement5() {
        RemoveElementSolution solution = new RemoveElementSolution();
        int[] nums = null;
        int result = solution.removeElement2(nums, 1);
        assertEquals(0, result);
    }
}