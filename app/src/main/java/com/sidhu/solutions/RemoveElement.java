package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/remove-element/description/
*/

public class RemoveElement implements Solution {
    public int removeElement(int[] nums, int val) {
        int w = 0;
        int r = 0;
        while (r < nums.length) {
            if (nums[r] != val) {
                nums[w++] = nums[r];
            }
            r++;
        }
        return w;
    }
    
}
