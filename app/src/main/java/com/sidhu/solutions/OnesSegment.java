package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/
*/

public class OnesSegment implements Solution {
    public boolean checkOnesSegment(String s) {
        int i = 1;
        int segCount = 1;
        int n = s.length();
        boolean notCounted = false;
        char c;
        while (i < n) {
            c = s.charAt(i);
            if (notCounted && c == '1') {
                segCount++;
                notCounted = false;
            } else if (c == '0') {
                notCounted = true;
            }
            i++;
        }
        return segCount == 1;
    }

    public boolean aiCheckOnesSegment(String s) {
        for (int i = 1; i < s.length(); i++) {
            // If current is '1' and previous was '0', a second segment has started
            if (s.charAt(i) == '1' && s.charAt(i - 1) == '0') {
                return false;
            }
        }
        return true;
    }
    
}
