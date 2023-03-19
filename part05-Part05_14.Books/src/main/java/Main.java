
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            // Check if book already exists in the list
            Book newBook = new Book(name, publicationYear);
            boolean bookExists = false;
            for (Book book : books) {
                if (book.equals(newBook)) {
                    bookExists = true;
                    break;
                }
            }
            
            if (!bookExists) {
                books.add(newBook);
            } else {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            }
            
            /*
            This approach is simpler and more concise than the previous approach. 
            It uses the contains() method of the ArrayList class to check whether a book is already in the list. 
            if (books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                books.add(book);
            }
            */
        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
