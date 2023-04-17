
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
public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack() {
        this.stack = new ArrayList<>();
    }
   
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public void add(String value) {
        stack.add(value);
    }
    
    public ArrayList<String> values() {
        ArrayList<String> values = new ArrayList<>();
        for (String value : this.stack) {
            values.add(value);
        }
        return values;
    }
    
    public String take() {
        if (stack.isEmpty()) {
        return null; // or throw an exception if you prefer
        } else {
        return stack.remove(stack.size() - 1);
        } 
    }
}
