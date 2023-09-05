
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Password?");
        String a=scan.nextLine();
        String b="Caput Draconis";
        if(a.equals(b)){
            System.out.println("Welcome!");
        } else{
            System.out.println("Off with you!");
        }
    }
}
