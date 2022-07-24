package com.linkedlist;

/*
Linked list node following Leetcode's conventions. All attributes are public.
 */

public class ListNode {
    public int data;
    public ListNode next;

    public ListNode() {}
    public ListNode(int data) {
        this.data = data;
    }
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
    public void printList() {
        ListNode a = this;
        while (a != null) {
            System.out.print(a.data + " -> ");
            a = a.next;
        }
        System.out.print("null\n");
    }
}
