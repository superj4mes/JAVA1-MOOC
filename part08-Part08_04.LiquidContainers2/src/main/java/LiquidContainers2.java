
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            if (command.equals("quit")) {
                break;
            }

            int amount = 0;
            if (parts.length > 1) {
                try {
                    amount = Integer.parseInt(parts[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid amount.");
                    continue;
                }
            }

            switch (command) {
                case "add":
                    firstContainer.add(amount);
                    break;
                case "move":
                    int moveAmount = Math.min(firstContainer.contains(), amount);
                    firstContainer.remove(moveAmount);
                    secondContainer.add(moveAmount);
                    break;
                case "remove":
                    secondContainer.remove(amount);
                    break;
                default:
                    System.out.println("Invalid command. Please enter 'add', 'move', 'remove', or 'quit'.");
                    break;
            }
        }

        scanner.close();
    }
}
