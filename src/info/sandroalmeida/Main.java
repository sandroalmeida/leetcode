package info.sandroalmeida;

import info.sandroalmeida.easy.*;
import info.sandroalmeida.hackerrank.MaximumHourglassSum;
import info.sandroalmeida.hackerrank.PrintLinkedList;

public class Main {

    public static void main(String[] args) {

        //TwoSum.solution();

        //ReverseInteger.solution();

        //System.out.println(PalindromeNumber.solution(0));

        //System.out.println(RomanToInteger.solution("CD"));

        //System.out.println(LongestCommonString.solution(new String[]{"almeidasandrocorrea", "mrs.sandro"}));

        //System.out.println(LongestCommonPrefix.solution(new String[]{"a", "a"}));

        //System.out.println(ValidParentheses.solution("{[]}()"));

        /*
        MergeTwoSortedLists.ListNode l1 = new MergeTwoSortedLists.ListNode(2);
        l1.next = new MergeTwoSortedLists.ListNode(2);
        l1.next.next = new MergeTwoSortedLists.ListNode(4);
        l1.next.next.next = new MergeTwoSortedLists.ListNode(7);
        MergeTwoSortedLists.ListNode l2 = new MergeTwoSortedLists.ListNode(1);
        l2.next = new MergeTwoSortedLists.ListNode(9);
        l2.next.next = new MergeTwoSortedLists.ListNode(15);
        l2.next.next.next = new MergeTwoSortedLists.ListNode(25);
        MergeTwoSortedLists.ListNode newList = MergeTwoSortedLists.solution(l1, l2);
        while(newList != null){
            System.out.println(newList.val);
            newList = newList.next;
        }
        */

        /*
        int[] nums = new int[]{1,1,2};
        int result = RemoveDuplicatesSortedArray.solution(nums);
        System.out.println(result);
        */

        /*
        int[] nums = new int[]{0,0,1,2,1,4,5};
        int result = RemoveElement.solution(nums, 1);
        System.out.println(result);
        */

        /*
        System.out.println(ImplementIndexOf.solution1("baagfdasaaa", "gf"));
        System.out.println(ImplementIndexOf.solution2("baagfdasaaa", "gf"));
        System.out.println(ImplementIndexOf.solution3("baagfdasaaa", "gf"));
        */

        //System.out.println(CountAndSay.solution(5));
        //System.out.println(CountAndSay.solution2(5));

        /*
        AddTwoNumbers.ListNode number1 = new AddTwoNumbers.ListNode(2);
        number1.next = new AddTwoNumbers.ListNode(4);
        //number1.next.next = new AddTwoNumbers.ListNode(3);

        AddTwoNumbers.ListNode number2 = new AddTwoNumbers.ListNode(5);
        number2.next = new AddTwoNumbers.ListNode(6);
        number2.next.next = new AddTwoNumbers.ListNode(4);

        AddTwoNumbers.ListNode result = AddTwoNumbers.solution(number1, number2);
        */

        //System.out.println(LongestSubstringNotRepeating.solution("test"));

        /*
        int[] input = {1,2,3,4};
        int[] output = PrintArrayReverseOrder.solution(input);
        for(int i : output){
            System.out.println(i);
        }
        */

        /*
        int[] input = {4,3,2,0};
        System.out.println(MonotonicArray.solution(input));
        */

        /*
        int[] input = {1,4,6,8,5,10,11};
        System.out.println(ThirdMaximumNumber.solution(input));
        System.out.println(ThirdMaximumNumber.solution2(input));
        System.out.println(ThirdMaximumNumber.solution3(input));
        */

        /*
        int[][] input = {{-9, -9, -9,  1, 1, 1},
                         { 0, -9,  0,  4, 3, 2},
                         {-9, -9, -9,  1, 2, 3},
                         { 0,  0,  8,  6, 6, 0},
                         { 0,  0,  0, -2, 0, 0},
                         { 0,  0,  1,  2, 4, 0}};
        System.out.println(MaximumHourglassSum.solution(input));
        */

        /*
        int[] input = {1,2,3,4,5,6,7};
        int[] output = RotateArray.solution2(input, 3);

        for(int i : output){
            System.out.println(i);
        }
        */

        /*
        int[] input = {1,2,3,4,5,6,7};
        int[] output = SortArrayByParity.solution2(input);

        for(int i : output){
            System.out.println(i);
        }
        */

        /*
        int[] input = {1,2,3,4,5,6,7};
        System.out.println(BinarySearch.solution(input, -1));
        */

        /*
        int[] input = {1,2,3,0,5,-1,7};
        PrintLinkedList linkedList = new PrintLinkedList(input);
        linkedList.print();
        */

        int[] input = {1,1,2,2,5};
        System.out.println(SingleNumber.solution(input));

    }
}
