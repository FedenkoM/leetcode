package org.leetcode.problems.easy.openParantesess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenParenthesesSolutionTest {

    @Test
    void testIsValid() {
        OpenParenthesesSolution solution = new OpenParenthesesSolution();
        assertTrue(solution.isValid("(test[{}])"));
    }

    @Test
    void testIsValid2() {
        OpenParenthesesSolution solution = new OpenParenthesesSolution();
        assertTrue(solution.isValid("()"));
    }

    @Test
    void testIsValid3() {
        OpenParenthesesSolution solution = new OpenParenthesesSolution();
        assertFalse(solution.isValid("[]]"));
    }

    @Test
    void testIsValid4() {
        OpenParenthesesSolution solution = new OpenParenthesesSolution();
        assertFalse(solution.isValid("("));
    }

    @Test
    void testIsValid5() {
        OpenParenthesesSolution solution = new OpenParenthesesSolution();
        assertFalse(solution.isValid(")"));
    }
}