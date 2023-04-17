
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
public class Suitcase {
    
    private ArrayList<Item> suitcase;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.suitcase = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        int totalWeight = 0;
        for (Item i: suitcase) {
            totalWeight += i.getWeight();
        }
        if (this.maxWeight - totalWeight >= item.getWeight()) {
            this.suitcase.add(item);
        }
    }
    
    public void printItems() {
        for (Item item : this.suitcase) {
            System.out.println(item);
        } 
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.suitcase) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.suitcase.isEmpty()) {
            return null;
        }

        Item heaviest = this.suitcase.get(0);
        for (Item item : this.suitcase) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Item item : this.suitcase) {
            totalWeight += item.getWeight();
        }
        StringBuilder sb = new StringBuilder();
        if (this.suitcase.size() == 0) {
            sb.append("no items (0 kg)");
        } else {
            sb.append(this.suitcase.size()).append(" ");
            if (this.suitcase.size() == 1) {
                sb.append("item");
            } else {
                sb.append("items");
            }
            sb.append(" (").append(totalWeight).append(" kg)");
        }
        return sb.toString();
    }
}
