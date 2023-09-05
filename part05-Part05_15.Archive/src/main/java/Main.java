import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> itemList = new ArrayList<>();
        Item item;

        while(true){
            System.out.println("Identifier? (empty will stop)");
            String name=scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name2=scanner.nextLine();
            if(name2.isEmpty()){
                break;
            }
            item=new Item(name,name2);
            if(!itemList.contains(item)){
                itemList.add(item);
            }
        }
        System.out.println("==Items==");
        for(Item items : itemList){
            System.out.println(items);
        }
    }
}
