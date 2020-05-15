package info.sandroalmeida.easy;
/*
* An array is monotonic if it is either monotone increasing or monotone decreasing.
  An array A is monotone increasing if for all i <= j, A[i] <= A[j].
  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
  Return true if and only if the given array A is monotonic.
  Example 1:
  Input: [1,2,2,3]
  Output: true
* */
public class MonotonicArray {

    public static boolean solution(int[] input){

        boolean increase = true;
        boolean decrease = true;
        if(input.length > 1){
            for(int i = 1; i < input.length; i++){
                if(input[i] < input[i-1])
                    increase = false;
                if(input[i] > input[i-1])
                    decrease = false;
            }
        }else{
            return true;
        }
        return increase == true || decrease == true;
    }
}
