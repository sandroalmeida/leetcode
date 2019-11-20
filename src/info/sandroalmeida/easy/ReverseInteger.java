package info.sandroalmeida.easy;

public class ReverseInteger {

    /*
    *   LeetCode 7
        Given a 32-bit signed integer, reverse digits of an integer.

        Example 1:
        Input: 123
        Output: 321

        Example 2:
        Input: -123
        Output: -321

        Example 3:
        Input: 120
        Output: 21

        Note:
        Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
        For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
    * */

    public static void solution(){

        // input
        int x = -205;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) System.out.println(0);
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))  System.out.println(0);
            rev = rev * 10 + pop;
        }
        System.out.println(rev);

    }

}
