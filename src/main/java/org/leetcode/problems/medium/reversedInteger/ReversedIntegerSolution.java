package org.leetcode.problems.medium.reversedInteger;

public class ReversedIntegerSolution {

    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            result = result * 10 + pop;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
