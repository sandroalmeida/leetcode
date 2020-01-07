package info.sandroalmeida.easy;

import java.util.HashMap;
import java.util.Map;

public class ImplementIndexOf {

    /*
    *   LeetCode 28 - Implement IndexOf

        Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

        Example 1:
        Input: haystack = "hello", needle = "ll"
        Output: 2

        Example 2:
        Input: haystack = "aaaaa", needle = "bba"
        Output: -1

        Clarification:
        What should we return when needle is an empty string? This is a great question to ask during an interview.
        For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
    * */

    // Using substring
    public static int solution1(String haystack, String needle){

        int H = haystack.length();
        int N = needle.length();

        for(int i = 0; i < H - N + 1; i++){
            if(haystack.substring(i, i + N).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    // Using two pointers
    public static int solution2(String haystack, String needle){

        int H = haystack.length();
        int N = needle.length();

        int pH = 0;
        while(pH < H - N + 1){
            // finding first match
            while(pH < H - N + 1 && haystack.charAt(pH) != needle.charAt(0))
                pH++;

            // compute the max match string
            int currLen = 0, pN = 0;
            while(pN < N && pH < H && haystack.charAt(pH) == needle.charAt(pN)){
                pH++;
                pN++;
                currLen++;
            }

            // if whole string is found
            if(currLen == N)
                return pH - N;

            // otherwise, return first pointer
            pH = pH - currLen + 1;
        }
        return -1;
    }

    // Using Map
    public static int solution3(String haystack, String needle){

        if(needle.length() == 0) return 0;

        Map<String, Integer> possibilities = new HashMap<>();
        int N = needle.length();
        int H = haystack.length();

        for(int i = 0; i < H; i++){

            if(i + N <= H) possibilities.put(haystack.substring(i, i + N), i);
            else possibilities.put(haystack.substring(i - N, i), i - N);

        }

        return possibilities.get(needle) != null ? possibilities.get(needle) : -1;
    }

}
