
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0, helper = 0;
        String name = "";
        
        while (true) {
            String str = scanner.nextLine();           
            
            if (str.isEmpty()) {
                break;
            }
            
            String[] array = str.split(",");
            
            // average of birth years
            sum = sum + Integer.valueOf(array[1]);
            count++;
            
            // longest name
            int longest = array[0].length();
            if (helper < longest) {
                helper = longest;
                name = array[0];
            }        
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of birth years: " + 1.0* sum / count);
    }           
}
