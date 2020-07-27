package com.example.datastracture.linkedlist;

/*This class responsible to create single linked list with 3 nodes */
public class SingleLinkedList {
  Node head = null;

  private void traverseLinkedList() {
    Node n = head;
    while (n.next != null) {
      System.out.println("value of linked list node " + n.data);
      n = n.next;
      if (n.next==null)
        System.out.println("value of linked list node " + n.data);
    }


  }

  public static void main(String args[]) {
    SingleLinkedList singleLinkedList = new SingleLinkedList();
    singleLinkedList.head = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);

    singleLinkedList.head.next = second; // Link first node with the second node
    second.next = third; // Link first node with the second node
    singleLinkedList.traverseLinkedList();

  }

  //Linked List Node
  static class Node {
    int data;
    Node next;

    Node(int d) {
      this.data = d;
      this.next = null;
    }
  }
}
