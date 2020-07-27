package com.example.datastracture.linkedlist;

import java.util.Scanner;

/*This class responsible to create single linked list with 3 nodes */
public class SingleLinkedListDynamically {
  Node head = null;

  private void traverseLinkedList(SingleLinkedListDynamically list) {
    Node n = list.head;
    while (n.next != null) {
      System.out.println("value of linked list node " + n.data);
      n = n.next;
      if (n.next == null)
        System.out.println("value of linked list node " + n.data);
    }


  }

  private SingleLinkedListDynamically addNodeToList(int data, SingleLinkedListDynamically list) {
    // Create a new node with given data
    Node new_node = new Node(data);
    new_node.next = null;

    // If the Linked List is empty,
    // then make the new node as head
    if (list.head == null) {
      list.head = new_node;
    } else {
      // Else traverse till the last node
      // and insert the new_node there
      Node last = list.head;
      while (last.next != null) {
        last = last.next;
      }

      // Insert the new_node at last node
      last.next = new_node;
    }

    // Return the list by head
    return list;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter how many nodes you wants in linked list");
    int nodeCount = scanner.nextInt();

    SingleLinkedListDynamically singleLinkedListDynamically = new SingleLinkedListDynamically();

    for (int i = 0; i < nodeCount; i++) {
      System.out.println("Enter data for node");
      int data = scanner.nextInt();
      singleLinkedListDynamically = singleLinkedListDynamically.addNodeToList(data, singleLinkedListDynamically);
    }
    singleLinkedListDynamically.traverseLinkedList(singleLinkedListDynamically);

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
