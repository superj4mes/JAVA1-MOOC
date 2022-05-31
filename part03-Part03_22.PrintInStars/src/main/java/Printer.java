
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // loop through whole array
        for (int i = 0; i < array.length; i++) {
            // loop through value of index and print value amount of stars
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            // after printing right amount of stars, print next set on a newline
            System.out.println("");
        }
    }
    
    /* Suggested solution
    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int stars : array) {
            printStars(stars);
            System.out.println();
        }
    }
 
    public static void printStars(int howMany) {
        while (howMany > 0) {
            System.out.print("*");
            howMany = howMany - 1;
        }
    }*/  
}
