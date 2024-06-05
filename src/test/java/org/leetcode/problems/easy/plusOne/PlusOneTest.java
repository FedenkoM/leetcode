package org.leetcode.problems.easy.plusOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void testPlusOne() {
        PlusOne plusOne = new PlusOne();
        int[] nums = {1,2,3,4,5,6,7};
        int[] result = plusOne.plusOne(nums);
        assertArrayEquals(new int[]{1,2,3,4,5,6,8}, result);
    }

    @Test
    void testPlusOne2() {
        PlusOne plusOne = new PlusOne();
        int[] nums = {9};
        int[] result = plusOne.plusOne(nums);
        assertArrayEquals(new int[]{1,0}, result);
    }

}