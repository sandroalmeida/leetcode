package info.sandroalmeida.easy;

public class LongestCommonPrefix {

    /*
    *   LeetCode 14
        Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".

        Example 1:
        Input: ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
        Note:

        All given inputs are in lowercase letters a-z.
    * */
    public static String solution(String[] strs){

        char[] first = null;
        char[] second = null;
        char[] longest;

        if(strs != null)
            first = strs[0].toCharArray();
        else
            return "";

        if(strs.length >= 1)
            second = strs[1].toCharArray();
        else
            return  "";

        String longestStr = compare(first, second);
        longest = longestStr.toCharArray();

        if(strs.length >= 2){
            for(int i = 2; i < strs.length; i++){
                String newStr = compare(longest, strs[i].toCharArray());
                if(newStr != null){
                    longestStr = newStr;
                    longest = longestStr.toCharArray();
                    continue;
                }
            }
        }
        return longestStr;
    }

    private static String compare(char[] s1, char[] s2){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s1.length; i++){
            for(int x = 0; x < s2.length; x++){
                if(s1[i] == s2[x]){
                    result.append(s1[i]);
                    break;
                }
            }
        }
        return (result.toString());
    }


}
