
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // Testing sorting integer array
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));
        
        // Testing sorting string array
        String[] array2 = {"dog", "boy", "weasel", "bear"};
        sort(array);
        System.out.println(Arrays.toString(array2));
        
        // Testing sorting ArrayList of integers
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(3, 1, 5, 99, 3, 12));
        sortIntegers(integers);
        System.out.println("Sorted ArrayList of integers: " + integers);
        
        // Testing sorting ArrayList of strings
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("dog", "boy", "weasel", "bear"));
        sortStrings(strings);
        System.out.println("Sorted ArrayList of strings: " + strings);
        
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
