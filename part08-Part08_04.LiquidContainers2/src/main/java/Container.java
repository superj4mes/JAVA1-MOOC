public class Container {
    private int liquidAmount;
    private final int MAX_CAPACITY = 100;

    public Container() {
        this.liquidAmount = 0;
    }

    public int contains() {
        return this.liquidAmount;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.liquidAmount += amount;
            if (this.liquidAmount > MAX_CAPACITY) {
                this.liquidAmount = MAX_CAPACITY;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.liquidAmount -= amount;
            if (this.liquidAmount < 0) {
                this.liquidAmount = 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.liquidAmount + "/" + MAX_CAPACITY;
    }
}
