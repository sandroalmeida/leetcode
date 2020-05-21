package info.sandroalmeida.easy;

/*
Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums.
If target exists, then return its index, otherwise return -1.

Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
* */
public class BinarySearch {

    public static int solution(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int pivot;
        while(left <= right){
            pivot = left + (right-left)/2;
            if(target == nums[pivot])
                return pivot;
            if(target < nums[pivot])
                right = pivot - 1;
            else
                left = pivot + 1;
        }
        return -1;
    }

}
