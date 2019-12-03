package info.sandroalmeida.easy;

/*
    LeetCode 21
    Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

    Example:

    Input: 1->2->4, 1->3->4
    Output: 1->1->2->3->4->4
* */

public class MergeTwoSortedLists {

    public static ListNode solution(ListNode l1, ListNode l2) {

        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        ListNode currentNew;
        ListNode newList;

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(currentL1.val <= currentL2.val){
            newList = new ListNode(currentL1.val);
            currentL1 = currentL1.next;
        } else{
            newList = new ListNode(currentL2.val);
            currentL2 = currentL2.next;
        }
        currentNew = newList ;

        while(currentL1 != null && currentL2 != null){
            if(currentL1.val <= currentL2.val){
                currentNew.next = new ListNode(currentL1.val);
                currentL1 = currentL1.next;
            } else{
                currentNew.next = new ListNode(currentL2.val);
                currentL2 = currentL2.next;
            }
            currentNew = currentNew.next;
        }

        if(currentL1 != null)
            currentNew.next = currentL1;
        if(currentL2 != null)
            currentNew.next = currentL2;

        return newList;
    }

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }


    }
}
