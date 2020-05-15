package info.sandroalmeida.hackerrank;

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
