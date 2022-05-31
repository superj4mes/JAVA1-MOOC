
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        // avoiding comma after last array[i]
        System.out.print(array[array.length - 1]);
       
        /* Some other ways to print without using loops
        System.out.println(IntStream.of(array).mapToObj(Integer::toString).collect(Collectors.joining(", "))); // prints 5, 1, 3, 4, 2
        System.out.println(IntStream.of(array).boxed().map(Object::toString).collect(Collectors.joining(", "))); // prints 5, 1, 3, 4, 2
        System.out.println(Arrays.toString(array)); // prints [5, 1, 3, 4, 2] */
        
     }
}
