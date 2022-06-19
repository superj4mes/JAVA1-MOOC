
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();
       
        try (Scanner reader = new Scanner(Paths.get(file))) {
            // read the file until all lines have been read
            while (reader.hasNextLine()) {
                // read one line
                String row = reader.nextLine();
                // print the line that was read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }     
    }
}
