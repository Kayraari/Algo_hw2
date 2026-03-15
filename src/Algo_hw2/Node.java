package Algo_hw2;
//
// Title: Node class
// Author: Kayra Arı-Elçin Karagül
// ID: 10001507-10885319050
// Section: 4
// Assignment: Hw1-Q2
// Description: This class represents a single node in a linked list.
//              Each node holds a data value and a reference to the next node.
//
public class Node {
    protected Object data; //The value stored in this Node
    protected Node next;    //Reference to the next Node in the list

    //
    // Summary: Constructor that creates a new node with given data and next pointer.
    // Precondition: data is a valid Object, next is a Node or null
    // Postcondition: a new node is created with the given data and next values
    //
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }  //
    // Summary: Returns the data stored in this node
    // Precondition: none
    // Postcondition: data is returned without modifying the node
    //

    public void setData(Object data) {
        this.data = data;
    }  //
    // Summary: Sets the data of this node
    // Precondition: data is a valid Object
    // Postcondition: node's data is updated to the given value
    //

    public Node getNext() {
        return next;
    }  //
    // Summary: Returns the next node in the linked list
    // Precondition: none
    // Postcondition: next node is returned without modifying the node
    //

    public void setNext(Node next) {
        this.next = next;
    } //
    // Summary: Sets the next node reference
    // Precondition: next is a valid Node or null
    // Postcondition: this node's next pointer is updated to the given node
    //
}