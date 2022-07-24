package com.linkedlist;

import java.util.HashSet;

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
        if (list1.data <= list2.data) {
            temp = list1;  // this will be returned
            temp.next = mergeTwoLists(list1.next, list2);
        } else {
            temp = list2;
            temp.next = mergeTwoLists(list1, list2.next);
        }
        return temp;  // eventually temp will be null
    }

    public ListNode removeDupsUnsorted(ListNode head) {
        HashSet<Integer> seen = new HashSet<Integer>();
        ListNode previous = null;       // placeholder for result
        ListNode temp = head;
        while (head != null) {
            if (seen.contains(head.data)) {
                previous.next = head.next;
            } else {
                seen.add(head.data);
                previous = head;
            }
            head = head.next;
        }
        return temp;
    }

    public ListNode findKthToLast(ListNode head, int k) {
        int length = findLength(head);

        ListNode a = head;
        while (a.next != null && length != k) {
            length -= 1;
            a = a.next;
        }
        return a;
    }

    public int findLength(ListNode head) {
        if (head.next == null) {
            return 1;   // head.next == null
        } else {
            return findLength(head.next) + 1;
        }
    }

    public ListNode partition(ListNode head, int partition) {
        ListNode prev = null;
        ListNode a = head;
        while (a != null) {
            if (a.data < partition && prev != null) {
                // ignore the original head (already at front)
                prev.next = a.next;
                a.next = head;
                head = a;
                a = prev.next;      // return back to place in list
            } else {
                prev = a;
                a = a.next;
            }
        }
        return head;
    }
}
