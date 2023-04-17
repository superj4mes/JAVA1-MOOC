
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JESSE
 */
public class Hold {
    
    private ArrayList<Suitcase> holder;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holder = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int holdWeight = 0;
        for (Suitcase sc : holder) {
            holdWeight += sc.totalWeight();
        }
        if ((this.maxWeight - holdWeight) >= suitcase.totalWeight()) {
            this.holder.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase : holder) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        int holderWeight = 0;
        for (Suitcase suitcase : holder) {
            holderWeight += suitcase.totalWeight();
        }
        return this.holder.size() + " suitcases (" + holderWeight + " kg)";
    }
}
