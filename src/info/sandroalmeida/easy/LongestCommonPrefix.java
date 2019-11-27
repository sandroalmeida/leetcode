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

        String result = "";
        if(strs != null){
            String first = strs[0];
            boolean check = false;
            for(int i = 0; i < first.length(); i++){
                for(int z = i+1; z <= first.length(); z++){
                    String part = first.substring(i,z);
                    for(int x = 1; x < strs.length; x++){
                        if(strs[x].contains(part))
                            check = true;
                        else{
                            check = false;
                            break;
                        }
                    }
                    if(part.length() > result.length() && check)
                        result = part;
                }
            }
        }
        return result;
    }

}
