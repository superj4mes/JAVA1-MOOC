import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Times?");
        int howManyTimes = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(howManyTimes);
    }

    public static void printFromNumberToOne(int n) {
        int i = 0;
        while (n > i) {
            System.out.println(n);
            n--;
        }
    }
}