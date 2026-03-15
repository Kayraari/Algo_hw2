package Algo_hw2;

public class Stack {
    Node top;
    Node minTop;
    int size;
    LinkedList list;

    public Stack(Node top, Node minTop) {
        this.top = top;
        this.minTop = minTop;
        size = 0;
        this.list = new LinkedList(null);
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public void push(Object V) {
        Node newNode = new Node(V, null);

        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }

        size++;

        // update the min stack
        if (minTop == null || (Integer) V <= (Integer) minTop.data) {
            Node minNode = new Node(V, null);
            minNode.setNext(minTop);
            minTop = minNode;
        }
    }

    public int getNewMin() {
        if (top == null) {
            return -1;
        }

        Node current = top;
        int min = (Integer) current.data;

        while (current != null) {
            if ((Integer) current.data < min) {
                min = (Integer) current.data;
            }
            current = current.next;
        }

        return min;
    }

    public void pop() {
        if (top == null) {
            return;
        }

        Object deletedValue = top.data;
        top = top.next;
        size--;

        if (minTop != null && ((Integer) deletedValue).equals((Integer) minTop.data)) {
            minTop = minTop.next;
        }
    }

    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}