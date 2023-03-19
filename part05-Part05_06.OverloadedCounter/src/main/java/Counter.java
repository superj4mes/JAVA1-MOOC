/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JESSE
 */
public class Counter {
    private int startValue;
    
    public Counter(int startValue) {
       this.startValue = startValue; 
    }
    
    public Counter() {
        this.startValue = 0;
    }
    
    public int value() {
        return this.startValue;
    }
    
    public void increase() {
        this.startValue++;
    }
    
    public void decrease() {
        this.startValue--;
    }
    
    public void increase(int increaseBy) {
        int i = 0;
        
        while(i<increaseBy) {
            increase();
            i++;
        }
    }
    
    public void decrease(int decreaseBy) {
        int i = 0;
        
        while(i<decreaseBy) {
            decrease();
            i++;
        }
    }
    
    public int getStartValue() {
        return startValue;
    }
}
