package com;

/*
Linked list node following Leetcode's conventions. All attributes are public.
 */

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public void printList() {
        ListNode a = this;
        while (a != null) {
            System.out.print(a.val + " -> ");
            a = a.next;
        }
        System.out.print("null\n");
    }
}
