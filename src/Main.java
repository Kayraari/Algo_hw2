//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Stack stack= new Stack(null, null);

        int n = keyboard.nextInt();
        for(int i=0; i<n; i++){
            String input = keyboard.next();

            if(input.equals("ADD")){
                int V = keyboard.nextInt(); //this reads the V value
                stack.push(V);
            } else if( input.equals("DEL")){
                stack.pop();
            } else if( input.equals("MIN")){
                stack.getNewMin();
            }
        }
        keyboard.close();
    }
}