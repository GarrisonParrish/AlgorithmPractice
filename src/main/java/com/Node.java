package com;

public class Node {
    private int data;
    private Node next;

    // Constructor with no data argument
    public Node () {
        this.data = 0;
    }
    // Constructor with data argument
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void print() {
        System.out.println(this.data);
    }

    public void setNext(Node n) {
        this.next = n;
    }

    public void printList() {
        Node a = this;
        while (a != null) {
            System.out.print(a.data + " -> ");
            a = a.next;
        }
        System.out.print("null");
    }
}