package info.sandroalmeida.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*
    *   Given an array of integers, return indices of the two numbers such that they add up to a specific target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        Example:
        Given nums = [2, 7, 11, 15], target = 9,
        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].
    * */

    public static void solution(){

        // initial parameters
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // solution code
        Map<Integer, Integer> rests = new HashMap<>();
        int[] result = {-1, -1};

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int rest = target - num;
            if(rests.containsKey(num)){
                result[0] = rests.get(num);
                result[1] = i;
                break;
            } else{
                rests.put(rest, i);
            }
        }

        System.out.println(rests);
        System.out.println("(" + result[0] + "),(" + result[1] + ")");

    }


}
