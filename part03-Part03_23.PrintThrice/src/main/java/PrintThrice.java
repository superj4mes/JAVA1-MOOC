
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word: ");  
        try {
            String word = scanner.nextLine();
            for (int i = 0; i < 3; i++) {
                System.out.print(word);
            }
        } catch(Exception e) {
            System.out.println("Something went wrong.");
        }
    }
    
    // more simple solution
    //System.out.print("Give a word: ");
    //String word = scanner.nextLine();
 
    //System.out.println(""); // empty line
    //System.out.println(word + word + word)
}