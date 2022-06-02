
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            String word = scanner.nextLine();

            if (word.isEmpty()) {
                break;
            }

            String[] strings = word.split(" ");

            for (String str : strings) {
                if (str.contains("av")) {
                    System.out.println(str);
                }
            }
        }
    }
}
