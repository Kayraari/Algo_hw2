package Algo_hw2;
//
// Title: Stack class
// Author: Kayra Arı-Elçin Karagül
// ID: 10001507-10885319050
// Section: 4
// Assignment: Hw1-Q2
// Description: This class implements a stack using linked nodes with O(1)
//              minimum tracking using a secondary min stack (minTop).
//
public class Stack {
    Node top; //Top of the main stack
    Node minTop; //Top of the min tracking stack
    int size; //Number of elements in stack
    LinkedList list;
    //
    // Summary: Constructor that initializes the stack with given top and minTop nodes.
    // Precondition: top and minTop are Node objects or null
    // Postcondition: stack is initialized with size 0
    //
    public Stack(Node top, Node minTop) {
        this.top = top;
        this.minTop = minTop;
        size = 0;
        this.list = new LinkedList(null);
    }
    //
    // Summary: Returns the top node of the stack
    // Precondition: none
    // Postcondition: top node is returned without modifying the stack
    //
    public Node getTop() {
        return top;
    }
    //
    // Summary: Sets the top node of the stack
    // Precondition: top is a valid Node or null
    // Postcondition: top is updated to the given node
    //
    public void setTop(Node top) {
        this.top = top;
    }

    //
    // Summary: Pushes a new value onto the top of the stack.
    //          Also updates the min stack if the new value is less than
    //          or equal to the current minimum.
    // Precondition: V is a valid Integer object
    // Postcondition: new node added to top, size incremented,
    //                minTop updated if V is new minimum
    //
    public void push(Object V) {
        Node newNode = new Node(V, null);

        if (top == null) {
            top = newNode; //first element, top is the new node
        } else {
            newNode.setNext(top); //new node points to old top
            top = newNode;  //top is now the new node
        }

        size++;

        //Update the min stack
        if (minTop == null || (Integer) V <= (Integer) minTop.data) {
            Node minNode = new Node(V, null);
            minNode.setNext(minTop);
            minTop = minNode;
        }
    }

    //
    // Summary: Returns the minimum value in the stack by scanning all elements.
    //          Returns -1 if the stack is empty.
    // Precondition: none
    // Postcondition: minimum value is returned, stack is unchanged
    //

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
    //
    // Summary: Removes the top element from the stack. Also pops the min
    //          stack if the removed value was the current minimum.
    // Precondition: none
    // Postcondition: top element removed, size decremented,
    //                minTop updated if removed value was the minimum
    //
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
    //
    // Summary: Prints all elements in the stack from top to bottom.
    // Precondition: none
    // Postcondition: all elements printed, stack is unchanged
    //
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}