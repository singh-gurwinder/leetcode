package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/roman-to-integer/description/
*/

public class RomanToInteger implements Solution {

    public int romanToInt(String s) {
        int result = 0;
        int n = s.length();
        int current;
        for (int i = 0; i < n; i++) {
            current = getValue(s.charAt(i));
            if (i < n - 1 && current < getValue(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
