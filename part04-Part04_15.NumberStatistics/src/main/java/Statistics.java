/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JESSE
 */
public class Statistics {
    
    private int count, sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.sum += number;
        this.count++;       
    }

    public int getCount() {
        // write code here
        return this.count;
    }
    
    public int sum() {
        // write code here
        return this.sum;
    }

    public double average() {
        // write code here
        if(this.count == 0) {
            return 0.0;
        }
        
        double average = 1.0 * this.sum / this.count;
        
        return average;
    }
}