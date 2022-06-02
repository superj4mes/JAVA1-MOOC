
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            String str = scanner.nextLine();           
            
            if (str.isEmpty()) {
                break;
            }
            
            String[] array = str.split(",");
            number = Integer.valueOf(array[1]);
            list.add(number);
            
        }
        Collections.sort(list);
        System.out.println("Age of the oldest: " + list.get(list.size() -1)); 
    }
    
        /* Mooc solution
        
        int oldest = -1;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            if (age > oldest) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);*/
}
