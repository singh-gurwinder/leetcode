package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/length-of-last-word/description/
*/

public class LastWordLength implements Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.lastIndexOf(" ");
        return i < 0 ? s.length() : s.length() - i - 1;
    }

}
