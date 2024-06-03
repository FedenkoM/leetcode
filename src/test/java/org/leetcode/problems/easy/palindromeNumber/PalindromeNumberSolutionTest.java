package org.leetcode.problems.easy.palindromeNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberSolutionTest {

    @Test
    void testIsPalindrome() {
        PalindromeNumberSolution palindromeNumberSolution = new PalindromeNumberSolution();
        assertTrue(palindromeNumberSolution.isPalindrome(121));
    }

    @Test
    void testIsPalindrome2() {
        PalindromeNumberSolution palindromeNumberSolution = new PalindromeNumberSolution();
        assertTrue(palindromeNumberSolution.isPalindrome(9));
    }

    @Test
    void testIsPalindrome3() {
        PalindromeNumberSolution palindromeNumberSolution = new PalindromeNumberSolution();
        assertTrue(palindromeNumberSolution.isPalindrome(0));
    }

    @Test
    void testIsPalindrome4() {
        PalindromeNumberSolution palindromeNumberSolution = new PalindromeNumberSolution();
        assertFalse(palindromeNumberSolution.isPalindrome(123));
    }

    @Test
    void testIsPalindrome5() {
        PalindromeNumberSolution palindromeNumberSolution = new PalindromeNumberSolution();
        assertFalse(palindromeNumberSolution.isPalindrome2(123));
    }

    @Test
    void testIsPalindrome6() {
        PalindromeNumberSolution palindromeNumberSolution = new PalindromeNumberSolution();
        assertFalse(palindromeNumberSolution.isPalindrome2(1234));
    }

}