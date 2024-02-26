import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // part 1
        int[] numbers1 = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers1)); // 5
        
        // part 2         0  1  2  3  4
        int[] numbers2 = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers2)); // 1
        
        // part 3          0  1  2  3   4
        int[] numbers3 = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 0)); // 0
        System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 1)); // 1
        System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 2)); // 3
        
        // part 4         
        int[] numbers4 = {3, 2, 5, 4, 8};
        
        System.out.println(Arrays.toString(numbers4));

        swap(numbers4, 1, 0);
        System.out.println(Arrays.toString(numbers4));

        swap(numbers4, 0, 3);
        System.out.println(Arrays.toString(numbers4));
        
        // part 5
        int[] numbers5 = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers5);
    }
    
    public static int smallest(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int smallestValue = array[0]; // Assume the first element is the smallest

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
                //System.out.println(smallestValue);
            }
        }

        return smallestValue;
    }
    
    public static int indexOfSmallest(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int smallestValue = smallest(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestValue) {
                return i;
            }
        }

        return -1; // If the smallest value is not found in the array
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        
        int smallestIndex = startIndex;
        
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
                //System.out.println(smallestIndex);
            }
        }
        
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid indices or array is null");
        }

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
     public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        
        System.out.println(Arrays.toString(array)); // Print original array
        
        for (int i = 0; i < array.length; i++) {
            int indexOfMin = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfMin);
            System.out.println(Arrays.toString(array)); // Print array after each swap
        }   
    }
}
