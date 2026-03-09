package com.sidhu.solutions;

import java.util.HashMap;
import java.util.Map;

/*
    Solution for https://leetcode.com/problems/two-sum/description/
*/

public class TwoSum implements Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valsMap = new HashMap<>();
        for (int n = 0; n < nums.length; n++) {
            int otherVal = target - nums[n];
            if (valsMap.containsKey(otherVal)) {
                return new int[] { valsMap.get(otherVal), n };
            }
            valsMap.put(nums[n], n);
        }
        return new int[] {};
    }

}
