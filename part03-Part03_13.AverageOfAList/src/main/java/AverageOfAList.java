
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        
        System.out.println("");
        float sum = 0;
        float count = 0;
        
        for (int number : list) {
            sum = sum + number;
            count++;
        }
        
        System.out.println("Average: " + sum/count);
        
    }
}
