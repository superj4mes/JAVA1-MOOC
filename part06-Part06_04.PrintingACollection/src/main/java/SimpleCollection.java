import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The collection ").append(this.name).append(" ");
        if (this.elements.isEmpty()) {
            sb.append("is empty.");
        } else {
            sb.append("has ").append(this.elements.size()).append(" element");
            if (this.elements.size() > 1) {
                sb.append("s");
            }
            sb.append(":\n");
            for (String element : this.elements) {
                sb.append(element).append("\n");
            }
        }
        return sb.toString().trim(); //remove trailing space after newline
    }
}  

    /* Study material example without using StringBuilder
    
    @Override
    public String toString() {
        String output = "The collection " + this.name;
        String elementsAsString = "";
        if (this.elements.isEmpty()) {
            return output + " is empty.";
        } else if (this.elements.size() == 1) {
            return output + " has " + this.elements.size() + " element:" + "\n" + this.elements.get(0);
        } else {
            for (String element : elements) {
                elementsAsString = elementsAsString+element + "\n";
            }
            return output + " has " + this.elements.size() + " elements:" + "\n" + elementsAsString;
        }

    }*/
