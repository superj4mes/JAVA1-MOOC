
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
public class Room {
    
    private ArrayList<Person> listOfPersons;
    
    public Room() {
        this.listOfPersons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.listOfPersons.add(person);
    }
        
    public boolean isEmpty() {
        return this.listOfPersons.isEmpty();
    }
            
    public ArrayList<Person> getPersons() {
        return this.listOfPersons;
    }
    
    public Person shortest() {
        if (this.listOfPersons.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.listOfPersons.get(0);
        for (Person person : listOfPersons) {
            if (shortestPerson.getHeight() > person.getHeight()) {
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }
       
    public Person take() {
        Person shortestPerson = this.shortest();
        this.listOfPersons.remove(shortestPerson);
        return shortestPerson;
    }
}
