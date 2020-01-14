package info.sandroalmeida.medium;

import java.util.HashMap;

public class LongestSubstringNotRepeating {

    /*
        LeetCode 3 - Longest Substring without Repeating Characters
        Given a string, find the length of the longest substring without repeating characters.

        Example 1:
        Input: "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.

        Example 2:
        Input: "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.

        Example 3:
        Input: "pwwkew"
        Output: 3
        Explanation:
        The answer is "wke", with the length of 3.
        Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
    * */
    public static int solution(String s) {

        if(s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int right=0; right<s.length(); right++){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left, map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right), right);
            max = Math.max(max, right-left+1);
        }
        return max;
    }

}
