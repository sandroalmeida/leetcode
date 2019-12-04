package info.sandroalmeida;

import info.sandroalmeida.easy.RemoveDuplicatesSortedArray;

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

        int[] nums = new int[]{1,1,2};
        int result = RemoveDuplicatesSortedArray.solution(nums);
        System.out.println(result);

    }
}
