package info.sandroalmeida.easy;

public class RomanToInteger {

    /*
    *   LeetCode 13
        Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        For example, two is written as II in Roman numeral, just two one's added together.
        Twelve is written as, XII, which is simply X + II.
        The number twenty seven is written as XXVII, which is XX + V + II.

        Roman numerals are usually written largest to smallest from left to right.
        However, the numeral for four is not IIII. Instead, the number four is written as IV.
        Because the one is before the five we subtract it making four.
        The same principle applies to the number nine, which is written as IX.
        There are six instances where subtraction is used:

        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
        Given a roman numeral, convert it to an integer.
        Input is guaranteed to be within the range from 1 to 3999.
    * */
    public static int solution(String s){

        char[] numbers = s.toCharArray();
        int result = 0;

        for(int i = 0; i < numbers.length; i++){
            char current, next = '#';
            current = numbers[i];

            if((i + 1) < numbers.length) {
                next = numbers[i+1];
            }

            int value;

            switch(current){
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    value = 0;
            }


            if(current == 'I' && (next == 'V' || next == 'X')) value = -1;
            if(current == 'X' && (next == 'L' || next == 'C')) value = -10;
            if(current == 'C' && (next == 'D' || next == 'M')) value = -100;

            result += value;
        }

        return result;

    }


}
