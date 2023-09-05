import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList(){
        this.list = new ArrayList<String>();
    }

    public void add(String task){

        this.list.add(task);
    }

    public void print(){
        for(String todo : list){
            System.out.println((list.indexOf(todo) + 1) + ": " + todo);
        }
    }

    public void remove(int number){
        this.list.remove(number-1);
    }
}
