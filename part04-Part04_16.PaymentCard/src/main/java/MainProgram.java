
public class MainProgram {

    public static void main(String[] args) {    

        /* removing extra code so part 6 can be verified
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
      
        // test for part 1 & 2
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);
        
        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);
        
        // test for part 3
        PaymentCard card2 = new PaymentCard(5);
        
        card2.eatHeartily();
        System.out.println(card2);

        card2.eatHeartily();
        System.out.println(card2);
        
        // test for part 4
        PaymentCard card3 = new PaymentCard(10);
        System.out.println(card3);

        card3.addMoney(15);
        System.out.println(card3);

        card3.addMoney(10);
        System.out.println(card3);

        card3.addMoney(200);
        System.out.println(card3);
        
        // test for part 5
        PaymentCard card4 = new PaymentCard(10);
        System.out.println("Paul: " + card4);
        card4.addMoney(-15);
        System.out.println("Paul: " + card4); */
        
        // test for part 6
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.addMoney(20);

        mattsCard.eatHeartily();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        mattsCard.addMoney(50);

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        
    }
}
