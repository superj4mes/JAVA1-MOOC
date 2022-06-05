

public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }
    
    // replace with to toString. JAVA automatically calls toString method even when 
    // not using henkilo1.toString() example: System.out.println(henkilo1)
    public void print() {
    System.out.println("My name is " + this.lastName + ", " + this.firstName + " " + this.lastName);
    }
    
    public String toString() {
        return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }
 
}
