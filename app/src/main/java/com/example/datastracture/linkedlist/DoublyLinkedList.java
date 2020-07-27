package com.example.datastracture.linkedlist;

/*This class responsible to create single linked list with 3 nodes */
public class DoublyLinkedList {
  Node head, tail = null;

  //display() will print out the nodes of the list
  private void traverseLinkedList() {
      //Node current will point to head
      Node current = head;
      if(head == null) {
        System.out.println("List is empty");
        return;
      }
      System.out.println("Nodes of doubly linked list: ");
      while(current != null) {
        //Prints each node by incrementing the pointer.

        System.out.print(current.data + " ");
        current = current.next;
      }
    }

  private DoublyLinkedList addNewNode(int data, DoublyLinkedList list) {
    //Create new node
    Node newNode = new Node(data);

    //If list is empty
    if (list.head == null) {
      //Both head and tail will point to newNode
      list.head = list.tail = newNode;
      //head's previous will point to null
      list.head.previous = null;
      //tail's next will point to null, as it is the last node of the list
      list.tail.next = null;
    } else {
      //newNode will be added after tail such that tail's next will point to newNode
      list.tail.next = newNode;
      //newNode's previous will point to tail
      newNode.previous = list.tail;
      //newNode will become new tail
      list.tail = newNode;
      //As it is last node, tail's next will point to null
      list.tail.next = null;
    }
    return list;
  }

  public static void main(String args[]) {
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    doublyLinkedList.addNewNode(10,doublyLinkedList);
    doublyLinkedList.addNewNode(20,doublyLinkedList);
    doublyLinkedList.addNewNode(30,doublyLinkedList);
    doublyLinkedList.traverseLinkedList();

  }

  //Linked List Node
  static class Node {
    int data;
    Node next;
    Node previous;

    Node(int d) {
      this.data = d;
      this.next = null;
      this.previous = null;
    }
  }
}
