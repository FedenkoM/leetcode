package org.leetcode.problems.easy.palindromeNumber;

public class PalindromeNumberSolution {

    public boolean isPalindrome(int x) {
        var stringNumber = String.valueOf(x);
        if (stringNumber.length() == 1) {
            return true;
        }
        var reverse = new StringBuilder(stringNumber).reverse();
        return stringNumber.contentEquals(reverse);
    }

    public boolean isPalindrome2(int x) {
        int initialValue = x;
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return initialValue == reverse;
    }
}
