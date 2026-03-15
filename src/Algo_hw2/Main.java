package Algo_hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack(null, null);

        int number = input.nextInt();

        for (int i = 0; i < number+1; i++) {
            String choice = input.next();

            if (choice.equals("ADD")) {
                int V = input.nextInt();
                stack.push(V);
            } else if (choice.equals("DEL")) {
                stack.pop();
            } else if (choice.equals("MIN")) {
                System.out.println(stack.getNewMin());
            }
        }

        input.close();
    }
}