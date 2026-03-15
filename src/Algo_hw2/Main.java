package Algo_hw2;

import java.util.Scanner;

public class Main {
    //Main method that reads N operations from input and dispatches them to the appropriate stack methods
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