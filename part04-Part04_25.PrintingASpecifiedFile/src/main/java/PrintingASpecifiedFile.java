
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String name=scanner.nextLine();
        try(Scanner scan=new Scanner(Paths.get(name));){
            while(scan.hasNext()){
                System.out.println(scan.nextLine());
            }
        } catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }

    }
}
