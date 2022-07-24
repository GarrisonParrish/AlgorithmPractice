package com;
/* similar to "using namespace" from C++, package statement lets us import public classes within package
* without having to specify the package name every time. */

import com.linkedlist.ListNode;
import com.linkedlist.Solution;
import com.binarytree.Node;

class Main {
    public static void main(String[] args) {
        System.out.println("Main function");
        testBinaryTree();
    }

    private static void testBinaryTree() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        /*
                1
              /   \
             2     3
         */
        n1.left = n2;
        n1.right = n3;

        System.out.println(n1.val);
        System.out.println(n1.left.val);
        System.out.println(n1.right.val);
    }

    private static void testLinkedListPartition() {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(8);

        ListNode n4 = new ListNode(5);
        /*
        ListNode n5 = new ListNode(10);
        ListNode n6 = new ListNode(2);
        ListNode n7 = new ListNode(1);
        */
        n1.next = n2;
        n2.next = n3;

        n3.next = n4;
        /*
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

         */
        n1.printList();

        Solution s = new Solution();
        // ListNode result = s.removeDupsUnsorted(n1);
        // ListNode result = s.mergeTwoLists(l1n1, l2n1);
        //
        ListNode result = s.partition(n1, 5);
        System.out.println("returned");
        result.printList();
    }
}

