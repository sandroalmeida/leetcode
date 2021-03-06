package info.sandroalmeida.easy;

public class CountAndSay {

    /*
    *   LeetCode 38
        The count-and-say sequence is the sequence of integers with the first five terms as following:

        1.     1
        2.     11
        3.     21
        4.     1211
        5.     111221
        *
        1 is read off as "one 1" or 11.
        11 is read off as "two 1s" or 21.
        21 is read off as "one 2, then one 1" or 1211.

        Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
        You can do so recursively, in other words from the previous member read off the digits, counting the number of digits in groups of the same digit.

        Note: Each term of the sequence of integers will be represented as a string.
    * */
    public static String solution(int n){

        String result = "1";
        int i = 1;

        while(i < n){
            result = auxiliar(result);
            i++;
        }

        return result;
    }

    private static String auxiliar(String str){

        char[] items = str.toCharArray();
        char currentChar = items[0];
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < items.length; i++){
            if(items[i] == currentChar){
                count++;
            }else{
                sb.append(count + "" + currentChar);
                currentChar = items[i];
                count = 1;
            }
        }
        sb.append(count + "" + currentChar);
        return sb.toString();
    }

    public static String solution2(int n){
        if(n == 1) return "1";
        StringBuilder result = new StringBuilder();
        String prev = solution2(n - 1);
        int count = 1;

        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == prev.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(prev.charAt(i - 1));
                count = 1;
            }
        }
        result.append(count).append(prev.charAt(prev.length() - 1));

        return result.toString();

    }

}
