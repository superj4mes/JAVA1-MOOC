
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            } else {
                list.add(input);
            }         
        }
        System.out.println(list.size());
    }
    
    /* without using list
    int count=0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            count++;
        }
        System.out.println(count);
    */
}
