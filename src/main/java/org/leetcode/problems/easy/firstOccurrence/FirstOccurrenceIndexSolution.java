package org.leetcode.problems.easy.firstOccurrence;

public class FirstOccurrenceIndexSolution {

    public int strStr(String haystack, String needle) {
        haystack = haystack.toLowerCase();
        int i = haystack.indexOf(needle);
        return i ;
    }

}
