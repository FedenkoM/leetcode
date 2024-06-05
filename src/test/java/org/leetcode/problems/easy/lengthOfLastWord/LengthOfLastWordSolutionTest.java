package org.leetcode.problems.easy.lengthOfLastWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordSolutionTest {

    @Test
    void testLengthOfLastWord() {
        LengthOfLastWordSolution lengthOfLastWordSolution = new LengthOfLastWordSolution();
        assertEquals(5, lengthOfLastWordSolution.lengthOfLastWord("Hello World"));
    }

    @Test
    void testLengthOfLastWord2() {
        LengthOfLastWordSolution lengthOfLastWordSolution = new LengthOfLastWordSolution();
        assertEquals(4, lengthOfLastWordSolution.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void testLengthOfLastWord3() {
        LengthOfLastWordSolution lengthOfLastWordSolution = new LengthOfLastWordSolution();
        assertEquals(6, lengthOfLastWordSolution.lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    void testLengthOfLastWord4() {
        LengthOfLastWordSolution lengthOfLastWordSolution = new LengthOfLastWordSolution();
        assertEquals(0, lengthOfLastWordSolution.lengthOfLastWord(""));
    }
}