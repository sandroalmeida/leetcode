package info.sandroalmeida.easy;

/*
* Given a non-empty array of integers, return the third maximum number in this array.
* If it does not exist, return the maximum number.
* The time complexity must be in O(n).
* */

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {

    public static int solution(int[] input){

        // Changing it on a set to eliminate duplications
        Set<Integer> setNumbers = new HashSet<>();
        for(int i: input) setNumbers.add(i);

        // Getting max from set
        int max = Collections.max(setNumbers);

        // If there're less than 3 return max before continue
        if(setNumbers.size() < 3) return max;

        // If there're 3 or more remove the max
        setNumbers.remove(max);

        // Remove the second Max
        max = Collections.max(setNumbers);
        setNumbers.remove(max);

        // Return the Third max
        return Collections.max(setNumbers);
    }

    public static int solution2(int[] input){

        Set<Integer> setNumbers = new HashSet<>();
        for(int i : input){
            setNumbers.add(i);
            if(setNumbers.size() > 3)
                setNumbers.remove(Collections.min(setNumbers));
        }
        return setNumbers.size() == 3 ? Collections.min(setNumbers) : Collections.max(setNumbers);
    }
    
}
