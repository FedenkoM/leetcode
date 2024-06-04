package org.leetcode.problems.easy.romanToInteger;

public class RomanToIntegerSolution {

    public int romanToInt(String s) {
        int result = 0;
        int previous = 0;
        for(int i = s.length()-1; i >= 0; i--){
            int currentValue = convertCharToInteger(s.charAt(i));
            if(currentValue < previous) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            previous = currentValue;
        }
        return result;
    }

//    1994 -> "MCMXCIV"
//    1000 100 1000 10 100 1 5
    private int convertCharToInteger(Character s) {
        return switch (s) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
