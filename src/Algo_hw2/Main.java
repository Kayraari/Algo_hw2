
package Algo_hw2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Stack stack= new Stack(null, null);
        String choice = input.nextLine();

        if(choice.equals("ADD")){ //bu sikintili olmayacak substring kullancaz
            int V = input.nextInt(); //this reads the V value
            stack.push(V);
        } else if( choice.equals("DEL")){
            stack.pop();
        } else if( choice.equals("MIN")){
            stack.getNewMin();
        }
        input.close();
    }
    }
