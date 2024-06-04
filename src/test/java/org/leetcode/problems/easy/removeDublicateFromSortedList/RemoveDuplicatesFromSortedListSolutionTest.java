package org.leetcode.problems.easy.removeDublicateFromSortedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListSolutionTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicatesFromSortedListSolution solution = new RemoveDuplicatesFromSortedListSolution();
        int actual = solution.removeDuplicates(new int[]{1, 1, 2, 2, 3, 3, 4});
        assertEquals(4, actual);
    }

    @Test
    void removeDuplicates2() {
        RemoveDuplicatesFromSortedListSolution solution = new RemoveDuplicatesFromSortedListSolution();
        int actual = solution.removeDuplicates2(new int[]{1, 1, 2, 2, 3, 3, 4});
        assertEquals(4, actual);
    }
}