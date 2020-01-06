package info.sandroalmeida.easy;

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

}
