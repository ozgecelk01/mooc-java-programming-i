import java.util.Scanner;
public class UserInterface {

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list,Scanner scan){
        this.list=list;
        this.scan=scan;
    }
    public void start(){
        while(true){
            System.out.println("Command:");
            String input=scan.nextLine();
            if(input.equals("stop")){
                break;
            }
            else if(input.equals("add")){
                System.out.println("To add:");
                String name=scan.nextLine();
                list.add(name);
            }
            else if(input.equals("list")){
                list.print();
            }
            else if(input.equals("remove")){
                System.out.println("Which one is removed?");
                int number= Integer.valueOf(scan.nextLine());
                list.remove(number);
            }
        }
    }
}
