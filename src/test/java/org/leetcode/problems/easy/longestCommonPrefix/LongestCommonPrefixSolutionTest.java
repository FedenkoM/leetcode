package org.leetcode.problems.easy.longestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixSolutionTest {

    @Test
    void testLongestCommonPrefix() {
        var commonPrefix = new LongestCommonPrefixSolution();
        String actual = commonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assertEquals("fl", actual);
    }

    @Test
    void testLongestCommonPrefix2() {
        var commonPrefix = new LongestCommonPrefixSolution();
        String actual = commonPrefix.longestCommonPrefix(new String[]{"a"});
        assertEquals("a", actual);
    }

    @Test
    void testLongestCommonPrefix3() {
        var commonPrefix = new LongestCommonPrefixSolution();
        String actual = commonPrefix.longestCommonPrefix(new String[]{"ab", "a"});
        assertEquals("a", actual);
    }
}