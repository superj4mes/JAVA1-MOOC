
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        
        System.out.println("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());
        int i = 0;
        
        while (i <= last) {
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
