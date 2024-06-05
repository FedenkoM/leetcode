package org.leetcode.problems.easy.lengthOfLastWord;

public class LengthOfLastWordSolution {

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        String[] words = s.split("\\W");

        if (words.length == 0) {
            return 0;
        }
        return words[words.length - 1].length();

    }

}
