package org.leetcode.problems.easy.TwoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumSolutionTest {

    @Test
    void shouldFindTwoSum() {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumSolution.twoSum(nums, target);
        assertNotNull(result);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void shouldFindTwoSum2() {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] nums = {2, 7, 15};
        int target = 22;
        int[] result = twoSumSolution.twoSum(nums, target);
        assertNotNull(result);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void shouldFindTwoSum3() {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] nums = {2, 3, 4, 5, 6};
        int target = 9;
        int[] result = twoSumSolution.twoSum(nums, target);
        assertNotNull(result);
        assertArrayEquals(new int[]{2, 3}, result);
    }

    @Test
    void shouldFindTwoSum4() {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 50;
        int[] result = twoSumSolution.twoSum(nums, target);
        assertNull(result);
    }

}