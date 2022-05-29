
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            listOfNumbers.add(input);
            
        }
        
        System.out.println("");
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        int smallest = listOfNumbers.get(0);

        for (int i = 0; i < listOfNumbers.size(); i++) {
            int number = listOfNumbers.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (smallest == listOfNumbers.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
        
        // or using while loop
        
        //int smallest = list.get(0);
        //int index = 0;
        //while (index < list.size()) {
        //    if (list.get(index) < smallest) {
        //        smallest = list.get(index);
        //    }
        //
        //    index++;
        //}
        
        //System.out.println("Smallest number: " + smallest);
 
        //index = 0;
        //while (index < list.size()) {
        //    if (list.get(index) == smallest) {
        //        System.out.println("Found at index: " + index);
        //    }
        //
        //    index++;
        //}      
    }
}
