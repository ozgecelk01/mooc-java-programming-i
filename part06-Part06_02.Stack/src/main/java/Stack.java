import java.util.ArrayList;

public class Stack {

    private final ArrayList<String> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void add(String value){
        this.list.add(value);
    }

    public ArrayList<String> values(){
        return list;
    }

    public String take(){
        String end = list.get(list.size() - 1);
        list.remove(end);
        return end;
    }
}
