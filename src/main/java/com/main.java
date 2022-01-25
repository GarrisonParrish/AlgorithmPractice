package com;
/* similar to "using namespace" from C++, package statement lets us import public classes within package
* without having to specify the package name every time. */

class Main {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        // n1.print();
        Node n2 = new Node(2);
        // n2.print();
        n1.setNext(n2);
        Node n3 = new Node(3);
        n2.setNext(n3);
        n1.printList();
    }
}

