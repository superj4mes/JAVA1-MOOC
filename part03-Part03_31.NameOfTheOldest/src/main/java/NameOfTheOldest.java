
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        String name = "";
        
        while (true) {
            String str = scanner.nextLine();           
            
            if (str.isEmpty()) {
                break;
            }
            
            String[] array = str.split(",");
            int age = Integer.valueOf(array[1]);
            if (number <= age) {
                number = age;
                name = array[0];
            }
        }
        System.out.println("Name of the oldest: " + name);        
    }
}
