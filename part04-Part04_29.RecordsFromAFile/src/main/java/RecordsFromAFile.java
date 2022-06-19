
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read file name
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        // try search file under root folder
        try {
            Scanner reader = new Scanner(Paths.get(file));
            // read every line 
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                // split lines using comma and store in array
                String[] array = line.split(",");
                // add array index to variable
                String name = array[0];
                int age = Integer.valueOf(array[1]);
                // print data in variables in one line
                System.out.println(name + ", age: " + age + " years");    
            } 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
