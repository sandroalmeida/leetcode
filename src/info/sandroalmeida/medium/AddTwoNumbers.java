package info.sandroalmeida.medium;

public class AddTwoNumbers {

    /*
    *   LeetCode 2 Add Two Numbers
        You are given two non-empty linked lists representing two non-negative integers.
        The digits are stored in reverse order and each of their nodes contain a single digit.
        Add the two numbers and return it as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.

        Example:

        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        Explanation: 342 + 465 = 807.
    * */

    public static ListNode solution(ListNode l1, ListNode l2){

        int sum = l1.val + l2.val;
        int extra = 0;
        ListNode result;

        if(sum >= 10){
            int rest = sum % 10;
            result = new ListNode(rest);
            extra = 1;
        } else{
            result = new ListNode(sum);
            extra = 0;
        }

        ListNode currentL1 = l1.next;
        ListNode currentL2 = l2.next;
        ListNode currentResult = result;

        while(currentL1 != null || currentL2 != null){

            if(currentL1 != null && currentL2 != null)
                sum = (currentL1.val + currentL2.val + extra);
            else if(currentL1 != null && currentL2 == null)
                sum = (currentL1.val + extra);
            else if(currentL1 == null && currentL2 != null)
                sum = (currentL2.val + extra);

            if(sum >= 10){
                int rest = sum % 10;
                currentResult.next = new ListNode(rest);
                extra = 1;
            } else{
                currentResult.next = new ListNode(sum);
                extra = 0;
            }

            if(currentL1 != null) currentL1 = currentL1.next;
            if(currentL2 != null) currentL2 = currentL2.next;
            currentResult = currentResult.next;

        }
        if(extra != 0) currentResult.next = new ListNode(sum);
        return result;
    }

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }


    }


}
