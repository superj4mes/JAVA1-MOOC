
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
public class MessagingService {
    
    private ArrayList<Message> messageObjectList;
    
    public MessagingService() {
        this.messageObjectList = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.messageObjectList.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.messageObjectList;
    }
}
