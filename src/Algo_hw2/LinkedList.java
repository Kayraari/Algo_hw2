package Algo_hw2;
//
// Title: LinkedList class
// Author: Kayra Arı-Elçin Karagül
// ID: 10001507-10885319050
// Section: 4
// Assignment: Hw1-Q2
// Description: This class implements a singly linked list with head and tail
//              pointers, used as the underlying data structure for the Stack.
//
public class LinkedList {

    public Node head; //First node of the list
    public Node tail; //Last node of the list
    public long size; // Number of elements in the list
    public int min; //Min value in the list

    //
    // Summary: Constructor that initializes the linked list with a given head node.
    //          If head is not null size is set to 1, otherwise 0.
    // Precondition: head is a Node object or null
    // Postcondition: linked list is initialized with head and tail pointing
    //                to the given node
    //
    public LinkedList(Node head) {
        this.head = head;
        this.tail = head;

        if (head != null) {
            this.size = 1;
        } else {
            this.size = 0;
        }
    }
    //
    // Summary: Returns the head node of the linked list
    // Precondition: none
    // Postcondition: head node is returned without modifying the list
    //
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }//
    // Summary: Sets the head node of the linked list
    // Precondition: head is a valid Node object or null
    // Postcondition: head is updated to the given node
    //

    public Node getTail() {
        return tail;
    }
    //
    // Summary: Returns the tail node of the linked list
    // Precondition: none
    // Postcondition: tail node is returned without modifying the list
    //

    public void setTail(Node tail) {
        this.tail = tail;
    }
    //
    // Summary: Sets the tail node of the linked list
    // Precondition: tail is a valid Node object or null
    // Postcondition: tail is updated to the given node
    //

    public long getSize() {
        return size;
    }
    //
    // Summary: Returns the number of elements in the linked list
    // Precondition: none
    // Postcondition: size is returned without modifying the list
    //

    public void setSize(long size) {
        this.size = size;
    }
    //
    // Summary: Sets the size of the linked list
    // Precondition: size is a valid long value
    // Postcondition: size is updated to the given value
    //

    public int getMin() {
        return min;
    }
    //
    // Summary: Returns the minimum value stored in the list
    // Precondition: none
    // Postcondition: min value is returned without modifying the list
    //

    public void setMin(int min) {
        this.min = min;
    }
    //
    // Summary: Sets the minimum value of the linked list
    // Precondition: min is a valid integer
    // Postcondition: min is updated to the given value
    //

    //
    // Summary: Adds a new node at the beginning (head) of the linked list.
    //          If the list was empty, tail is also updated to the new node.
    // Precondition: data is a valid Node object
    // Postcondition: data is inserted at head, size is incremented by 1
    //
    public void addFirst(Node data) {
        data.setNext(head); //new node points to old head
        head = data;    //head is now the new node
        if (tail == null) {
            tail = head; //if list was empty tail is also the new node
        }
        size++;
    }
    //
    // Summary: Removes the node at the beginning (head) of the linked list.
    //          If the list becomes empty, tail is also set to null.
    // Precondition: list may or may not be empty
    // Postcondition: head node is removed, size is decremented by 1
    //
    public void removeFirst() {
        if (head == null) {
            return;  //nothing to remove if list was empty
        }

        Node data = head;   //save old head
        head = head.getNext();  //moves head to next node
        data.setNext(null); //removes connection from old head

        if (head == null) {
            tail = null; //if list is now empty, tail is also null
        }

        size--;
    }
}