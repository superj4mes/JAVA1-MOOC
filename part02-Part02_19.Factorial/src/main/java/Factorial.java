
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        
        int number = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        
        while (number > 1) {
            factorial = factorial * number;
            number--;
        }
        System.out.println("Factorial: " + factorial);
        
        /*
        TAI
        int n = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
 
        int number = 1;
        while (number <= n) {
            factorial *= number;
            number++;
        }
        */
    }
}