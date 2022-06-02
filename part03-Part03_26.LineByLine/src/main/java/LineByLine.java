
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            String word = scanner.nextLine();

            if (word.isEmpty()) {
                break;
            }

            String[] strings = word.split(" ");

            for (String str : strings) {
                System.out.println(str);
            }
        }
    }
}