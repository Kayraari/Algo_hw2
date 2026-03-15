package Algo_hw2;

public class LinkedList {

    public Node head;
    public Node tail;
    public long size;
    public int min;

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
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void addFirst(Node data) {
        data.setNext(head);
        head = data;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

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