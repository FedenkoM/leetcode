package org.leetcode.problems.easy.firstOccurrence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstOccurrenceIndexSolutionTest {

    @Test
    void testStrStr() {
        FirstOccurrenceIndexSolution f = new FirstOccurrenceIndexSolution();
        assertEquals(0, f.strStr("aab", "aab"));
    }

    @Test
    void testStrStr2() {
        FirstOccurrenceIndexSolution f = new FirstOccurrenceIndexSolution();
        assertEquals(0, f.strStr("sadbutsad", "sad"));
    }

    @Test
    void testStrStr3() {
        FirstOccurrenceIndexSolution f = new FirstOccurrenceIndexSolution();
        assertEquals(-1, f.strStr("leetcode", "leeto"));
    }
}