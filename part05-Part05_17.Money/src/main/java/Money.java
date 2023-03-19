
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        int totalCents = this.euros * 100 + this.cents + addition.euros * 100 + addition.cents;
        int euros = totalCents / 100;
        int cents = totalCents % 100;
        return new Money(euros, cents);
    }
    
    public boolean lessThan(Money compared) {
        int totalCents = this.euros * 100 + this.cents;
        int comparedTotalCents = compared.euros * 100 + compared.cents;
        return totalCents < comparedTotalCents;
    }
    
    public Money minus(Money decreaser) {
        int totalCents = this.euros * 100 + this.cents - decreaser.euros * 100 - decreaser.cents;
        int euros = totalCents >= 0 ? totalCents / 100 : 0;
        int cents = totalCents >= 0 ? totalCents % 100 : 0;
        return new Money(euros, cents);
    }
}
