package info.sandroalmeida.easy;

/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

Example 1:
Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
* */
public class SortArrayByParity {

    public static int[] solution(int[] input){
        int[] output = new int[input.length];
        int lastOdd = 0;
        int lastEven = input.length - 1;

        for(int i = 0; i < input.length; i++){
            if(input[i] % 2 == 0) {
                output[lastOdd] = input[i];
                lastOdd++;
            } else{
                output[lastEven] = input[i];
                lastEven--;
            }
        }

        return output;
    }

}
