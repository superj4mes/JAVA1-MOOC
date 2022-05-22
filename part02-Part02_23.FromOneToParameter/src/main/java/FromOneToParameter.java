import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Times?");
        int howManyTimes = Integer.valueOf(scanner.nextLine());
        printUntilNumber(howManyTimes);
    }

    public static void printUntilNumber(int n) {
        int i = 1;
        while (n >= i) {
            System.out.println(i);
            i++;
        }
    }
}
