package Algo_hw2;

public class Node {
    protected Object data; //The value stored in this Node
    protected Node next;    //Reference to the next Node in the list

    //Constructor that creates a new Node with given data and next pointer
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    } //returns the data stored in this node

    public void setData(Object data) {
        this.data = data;
    }  //sets the data in this node

    public Node getNext() {
        return next;
    } //returns the next node in the linked list

    public void setNext(Node next) {
        this.next = next;
    } //sets the next node reference
}