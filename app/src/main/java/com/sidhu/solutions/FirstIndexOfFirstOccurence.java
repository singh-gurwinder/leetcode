package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
*/

public class FirstIndexOfFirstOccurence implements Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
