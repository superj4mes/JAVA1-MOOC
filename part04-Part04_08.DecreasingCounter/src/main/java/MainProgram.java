
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);
        DecreasingCounter counter2 = new DecreasingCounter(100);

        
        // test part 1 & 2
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
        
        // test part 3
        counter2.printValue();

        counter2.reset();
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();
        
    }
}
