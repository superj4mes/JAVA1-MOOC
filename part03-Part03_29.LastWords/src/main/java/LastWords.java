
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();           
            
            if (word.isEmpty()) {
                break;
            }
            
            String[] array = word.split(" ");
            System.out.println(array[array.length -1]);
        }
    }
}
