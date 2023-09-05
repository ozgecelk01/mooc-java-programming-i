import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while(true){
            System.out.println("Title: ");
            String name=scan.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int number=Integer.valueOf(scan.nextLine());
            System.out.println("Publication year: ");
            int year=Integer.valueOf(scan.nextLine());
            Book a=new Book(name,number,year);
            books.add(a);
        }
        System.out.println("What information will be printed? ");
        String word=scan.nextLine();
        for(Book i:books){
            if(word.equals("name")){
                System.out.println(i.getname());
            } else if(word.equals("everything")){
                System.out.println(i.toString());
            }

        }

    }
}
