
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            // read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // read one line
                String row = scanner.nextLine();
                // print the line that was read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }     
    }
}
