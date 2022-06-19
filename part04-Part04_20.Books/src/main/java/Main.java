import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int published = Integer.valueOf(scanner.nextLine());
            
            books.add(new Books(title, pages, published));
        }
        
        System.out.println("What information will be printed? ");
        String printed = scanner.nextLine();
        
        for (Books book : books) {
            if (printed.equalsIgnoreCase("everything")) {
                System.out.println(book);
            }
            if (printed.equalsIgnoreCase("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
