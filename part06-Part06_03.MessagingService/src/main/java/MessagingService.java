import java.util.ArrayList;

public class MessagingService {
    ArrayList<Message> messages = new ArrayList<>();

    public void add(Message message){
        if(message.length()){
            messages.add(message);
        }

    }

    public ArrayList<Message> getMessages(){
        return this.messages;
    }
}


