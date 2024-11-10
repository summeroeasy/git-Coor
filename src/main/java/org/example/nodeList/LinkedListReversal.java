package org.example.nodeList;

public class LinkedListReversal {

    //定义链表类
    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static Node reverseList(Node head){
        Node prev = null;
        Node current = head;

        while(current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }
}
