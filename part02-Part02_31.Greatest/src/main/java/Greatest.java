
import java.util.Arrays;


public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        
        /*using sort instead of if statement
        int greatest = number1;
        if (number2 > greatest) {
            greatest = number2;
        }
        if (number3 > greatest) {
            greatest = number3;
        }
        return greatest;*/
        
        int[] array = {number1, number2, number3};
        Arrays.sort(array);
        return array[2];
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
