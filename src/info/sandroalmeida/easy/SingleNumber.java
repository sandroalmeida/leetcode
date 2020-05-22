package info.sandroalmeida.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Given a non-empty array of integers, every element appears twice except for one.
Find that single one.

Note:
Your algorithm should have a linear runtime complexity.
Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4
* */
public class SingleNumber {

    public static int solution(int[] nums){
        Set<Integer> setNums = new HashSet<>();
        for(int i: nums){
            if(!setNums.contains(i)) {
                setNums.add(i);
            }else{
                setNums.remove(i);
            }
        }
        return (int) setNums.toArray()[0];
    }

}
