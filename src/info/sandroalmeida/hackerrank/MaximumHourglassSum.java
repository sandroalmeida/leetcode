package info.sandroalmeida.hackerrank;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
Given a 6x6 2D Array, arr:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

We define an hourglass in A to be a subset of values
with indices falling in this pattern in arr's graphical representation:

a b c
  d
e f g

There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum.

For example, given the 2D array:
-9 -9 -9  1 1 1
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0

 We calculate the following 16 hourglass values:
 -63, -34, -9, 12,
-10, 0, 28, 23,
-27, -11, -2, 10,
9, 17, 25, 18

Our highest hourglass value is 28 from the hourglass:
0 4 3
  1
8 6 6
* */
public class MaximumHourglassSum {

    public static int solution(int[][] matrix){

        Set<Integer> sums = new HashSet<>();
        for(int x = 1; x <= 4; x++){
            for(int y = 1; y <= 4; y++){
                sums.add(returnHourglassSum(matrix, x, y));
            }
        }

        return Collections.max(sums);
    }

    // This function will calculate the sum for an specific Hourglass
    // The Hourglass will be identified by its center on positions x and y
    private static int returnHourglassSum(int[][] matrix, int x, int y){
        return  matrix[x][y] +
                matrix[x-1][y] +
                matrix[x+1][y] +
                matrix[x-1][y+1] +
                matrix[x-1][y-1] +
                matrix[x+1][y+1] +
                matrix[x+1][y-1];
    }

}
