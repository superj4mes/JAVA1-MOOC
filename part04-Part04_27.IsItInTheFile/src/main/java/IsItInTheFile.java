
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            // read the file until all lines have been read
            while (reader.hasNextLine()) {
                // read one line of lines
                String row = reader.nextLine();
                // check if searchedFor contains in lines that were read
                if (row.contains(searchedFor)) {
                    System.out.println("Found!");
                    // finishing exectution otherwise "Not found." printed also
                    return;
                } 
            }
            // if row.contains(searchedFor) equals false
            System.out.println("Not found.");           
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }     
    }
}
