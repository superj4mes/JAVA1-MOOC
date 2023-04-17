
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("Jesse", "Hello World to all of you!");
        MessagingService m = new MessagingService();
        m.add(message);
        System.out.println(m.getMessages());
    }
}
