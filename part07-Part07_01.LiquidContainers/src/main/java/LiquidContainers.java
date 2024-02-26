
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Two liquid containers (capacity 100)
        int first = 0;
        int second = 0;
        
        // print empty values before adding to containers
        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");

        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            // takes (add amount) must be int, cant hold over 100, past 100 go waste
            if (command.equalsIgnoreCase("add")) {
                // ternary operator example: first = (amount > 0) ? ((first + amount > 100) ? 100 : first + amount) : first;
                if (amount > 0) {
                    first += amount;
                    if (first > 100) {
                    first = 100;
                    }
                }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
            }
            
            // moves (move amount) first to second, must be int, past 100 empty first, second past 100 go waste
            if (command.equalsIgnoreCase("move")) {
                if (amount > 0 && amount <= first) {
                    first -= amount;
                    second += amount;
                } else if (amount > first) {
                second += first;
                first = 0;
                }
                if (second > 100) {
                    second = 100;
                }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
            }     
            
            // remove (remove amount) from second, must be int, past 100 empty all from container
            if (command.equalsIgnoreCase("remove")) {
                if (amount > 0) {
                    second -= amount;  
                    if (second < 0) {
                        second = 0;
                    }
                }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
            }
        }
    }
}
