package Algo_hw2;

import java.util.Scanner;
//
// Title: Main class
// Author: Kayra Arı-Elçin Karagül
// ID: 10001507-10885319050
// Section: 4
// Assignment: Hw1-Q2
// Description: This class reads N operations from standard input and
//              dispatches them to the appropriate stack methods.
//              Operations supported are ADD, DEL, and MIN.
//
public class Main {
    //
    // Summary: Main method that reads N operations from input and dispatches
    //          them to the appropriate stack methods.
    // Precondition: First line is an integer N (number of operations),
    //               followed by N lines of "ADD V", "DEL", or "MIN"
    // Postcondition: Prints the minimum value for MIN operations,
    //                prints "Empty" for MIN and DEL when stack is empty
    //
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack(null, null);

        int number = input.nextInt(); //Number of operations

        for (int i = 0; i < number+1; i++) { //Loop through each operation
            String choice = input.next(); //Reads operation type

            if (choice.equals("ADD")) {
                int V = input.nextInt(); //Read the value to add
                stack.push(V); //Push value to stack
            } else if (choice.equals("DEL")) {
                stack.pop();    //Remove top element from stack
            } else if (choice.equals("MIN")) {
                System.out.println(stack.getNewMin());  //Print current min value
            }
        }

        input.close();
    }
}