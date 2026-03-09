package com.sidhu.solutions;

import java.util.HashMap;
import java.util.Map;

/*
    Solution for https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
*/

public class NoRepeatLongestSubstr implements Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.trim() =="" || s.trim().length() == 1)
            return 1;
        int length = 0;
        int n = s.length();
        int i = 0;
        Map<Character,Integer> index = new HashMap<>();
        char c;
        while (i < n) {
            c = s.charAt(i);
            if (index.containsKey(c)) {
                length = Math.max(length, index.size());
                i = index.get(c) + 1;
                index.clear();
                continue;
            }
            index.put(c, i++);
        }
        length = Math.max(length, index.size());
        return length;
    }

    public int aiLengthOfLongestSubstring(String s) {
        int n = s.length(), maxLength = 0;
        Map<Character, Integer> map = new HashMap<>(); // character -> latest index
        
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                // Move left pointer to the right of the last seen duplicate
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            maxLength = Math.max(maxLength, j - i + 1);
            map.put(s.charAt(j), j);
        }
        return maxLength;
    }

}
