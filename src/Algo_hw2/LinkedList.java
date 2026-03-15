package Algo_hw2;

public class LinkedList {

    public Node head; //First node of the list
    public Node tail; //Last node of the list
    public long size; // Number of elements in the list
    public int min; //Min value in the list

    //Constructor that initializes with a given head node, if head is not null size is set to 1 otherwise o
    public LinkedList(Node head) {
        this.head = head;
        this.tail = head;

        if (head != null) {
            this.size = 1;
        } else {
            this.size = 0;
        }
    }

    public Node getHead() {
        return head;
    } //Returns the head Node

    public void setHead(Node head) {
        this.head = head;
    }//Sets the head Node

    public Node getTail() {
        return tail;
    } //Returns the tail Node

    public void setTail(Node tail) {
        this.tail = tail;
    } //Sets the tail Node

    public long getSize() {
        return size;
    } //Returns the size

    public void setSize(long size) {
        this.size = size;
    } //Sets the size

    public int getMin() {
        return min;
    } //Returns the min integer

    public void setMin(int min) {
        this.min = min;
    } //Sets the min integer

    //Adds a new Node at the beginning(head) of the linked list, if the list was empty the tail is also updated
    public void addFirst(Node data) {
        data.setNext(head);
        head = data;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    //Removes the Node at the beginning (head) of the linked list, if the list becomes empty tail is also set to null
    public void removeFirst() {
        if (head == null) {
            return;
        }

        Node data = head;
        head = head.getNext();
        data.setNext(null);

        if (head == null) {
            tail = null;
        }

        size--;
    }
}