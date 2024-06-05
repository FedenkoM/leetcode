package org.leetcode.problems.easy.searchInsertPosition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 6;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(3, result);
    }

    @Test
    void searchInsert2() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 5;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(2, result);
    }

    @Test
    void searchInsert3() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 2;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(1, result);
    }

    @Test
    void searchInsert4() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 7;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(4, result);
    }

    @Test
    void searchInsert5() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {};
        int target = 6;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(0, result);
    }
}