package org.leetcode.problems.easy.removeDublicateFromSortedList;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedListSolution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;

        int[] uniqueNums = Arrays.stream(nums).distinct().toArray();

        System.arraycopy(uniqueNums, 0, nums, 0, uniqueNums.length);

        return uniqueNums.length;
    }


}
