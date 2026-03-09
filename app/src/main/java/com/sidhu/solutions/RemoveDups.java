package com.sidhu.solutions;

/*
    Solution for https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
*/

public class RemoveDups implements Solution {
    public int removeDuplicates(int[] nums) {
        int w = 0;
        int r = 1;
        while (r < nums.length) {
            if (nums[w] != nums[r]) {
                nums[++w] = nums[r];
            }
            else {
                r++;
            }
        }
        return ++w;
    }

}
