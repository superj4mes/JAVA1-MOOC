
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
public class Package {
    
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    
    public int totalWeight() {
        int giftTotalWeight = 0;
        if (this.gifts.isEmpty()) {
            return -1;
        } else {
            for (Gift gift : gifts) {
                giftTotalWeight += gift.getWeight();
            }
            return giftTotalWeight;   
        }
    }
}
