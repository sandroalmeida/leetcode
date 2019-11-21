package info.sandroalmeida.easy;

public class PalindromeNumber {

    /*
        LeetCode 9
        Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

        Example 1:
        Input: 121
        Output: true

        Example 2:
        Input: -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        Example 3:

        Input: 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
        Follow up:

        Could you solve it without converting the integer to a string?
    * */
    public static boolean solution(int x){

        if(x < 0) return false;
        int size = String.valueOf(x).length();

        int[] numbers = new int[size];
        for(int i = 0; i < size; i++){
            numbers[i] = x % 10;
            x /= 10;
        }

        int i = 0;
        int l = size - 1;
        while(i <= l){
            if(numbers[i] == numbers[l]){
                if(i == l || i == (l-1))
                    return true;
                else {
                    i++;
                    l--;
                    continue;
                }
            } else{
                break;
            }
        }

        return false;
    }

}
