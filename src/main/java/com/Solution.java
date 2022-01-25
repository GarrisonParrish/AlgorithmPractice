package com;

import java.util.List;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        // base cases: when a list is null, return the other one
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        // recursive case
        if (list1.val <= list2.val) {
            temp = list1;  // this will be returned
            temp.next = mergeTwoLists(list1.next, list2);
        } else {
            temp = list2;
            temp.next = mergeTwoLists(list1, list2.next);
        }
        return temp;  // eventually temp will be null
    }

    public static void main(String[] args) {
        // list 1:
        // 1 -> 2 -> 3
        ListNode l1n1 = new ListNode(5);
        ListNode l1n2 = new ListNode(10);
        ListNode l1n3 = new ListNode(15);
        l1n1.next = l1n2;
        l1n2.next = l1n3;
        l1n1.printList();

        // list 2:
        // 1 -> 3 -> 4
        ListNode l2n1 = new ListNode(2);
        ListNode l2n2 = new ListNode(3);
        ListNode l2n3 = new ListNode(20);
        l2n1.next = l2n2;
        l2n2.next = l2n3;
        l2n1.printList();

        Solution s = new Solution();
        ListNode result = s.mergeTwoLists(l1n1, l2n1);
        result.printList();
    }
}
