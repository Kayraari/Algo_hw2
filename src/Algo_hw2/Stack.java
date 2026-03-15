package Algo_hw2;

public class Stack {
    Node top; //Top of the main stack
    Node minTop; //Top of the min tracking stack
    int size; //Number of elements in stack
    LinkedList list;

    public Stack(Node top, Node minTop) { //Constructor that initializes the stack
        this.top = top;
        this.minTop = minTop;
        size = 0;
        this.list = new LinkedList(null);
    }

    public Node getTop() { //Returns top Node
        return top;
    }

    public void setTop(Node top) { //Sets top Node
        this.top = top;
    }

    //Pushes a new value onto the top of the stack, also updates the min value if the new value is less than
    // or equal to the previos min value
    public void push(Object V) {
        Node newNode = new Node(V, null);

        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }

        size++;

        //Update the min stack
        if (minTop == null || (Integer) V <= (Integer) minTop.data) {
            Node minNode = new Node(V, null);
            minNode.setNext(minTop);
            minTop = minNode;
        }
    }

    //Prints the min value in the stack using the min stack.
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
     //Removes the top element from the stack. also pops the min stack if the removed value was the minimum
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
    //Prints all elements from the stack from top to bottom
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}