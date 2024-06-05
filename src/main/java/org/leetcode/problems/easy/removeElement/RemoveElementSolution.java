package org.leetcode.problems.easy.removeElement;

import java.util.Arrays;

public class RemoveElementSolution {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] array = Arrays.stream(nums)
                .filter(num -> num != val)
                .toArray();
        System.arraycopy(array, 0, nums, 0, array.length);
        return array.length;
    }

    public int removeElement2(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
