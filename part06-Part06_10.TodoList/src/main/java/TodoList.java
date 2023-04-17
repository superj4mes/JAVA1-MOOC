
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JESSE
 */
public class TodoList {
    
    private HashMap<Integer, String> tasks;
    
    public TodoList() {
        this.tasks = new HashMap<>();
    }
    
    public void add(String task) {
        int number = tasks.size() + 1;
        this.tasks.put(number, task);
    }
    
    public void print() {
        for (int i = 1; i <= tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }
    
    public void remove(int number) {
        this.tasks.remove(number);
        // re-number the tasks after the removed task
        for (int i = number + 1; i <= tasks.size() + 1; i++) { //  iterates over the remaining tasks. start loop after task removed number + 1
            tasks.put(i - 1, tasks.get(i)); // Shift each task's number down by one to fill the gap left by the removed task
            tasks.remove(i); // This removes the old key-value pair
        }
    }
}
