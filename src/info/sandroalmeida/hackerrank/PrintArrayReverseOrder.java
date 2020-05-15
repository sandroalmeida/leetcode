package info.sandroalmeida.hackerrank;

/*
    Print all  integers in  in reverse order
    as a single line of space-separated integers.
* */

public class PrintArrayReverseOrder {

    public static int[] solution(int[] input){
        int[] output = new int[input.length];
        int x = 0;
        for(int i = input.length-1; i >= 0; i--){
            output[x] = input[i];
            x++;
        }
        return output;
    }
}
