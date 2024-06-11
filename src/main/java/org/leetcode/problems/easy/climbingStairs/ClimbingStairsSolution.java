package org.leetcode.problems.easy.climbingStairs;

public class ClimbingStairsSolution {

    public int climbStairs(int n) {
        int prev = 1;
        int prevtoprev = 1;
        int curr = -1;

        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            curr = prev + prevtoprev;
            prevtoprev = prev;
            prev = curr;
        }
        return curr;
    }

}
