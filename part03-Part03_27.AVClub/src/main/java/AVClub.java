
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                return;
            }
            String arr[] = input.split(" ");
            for (String x : arr) {
                if (x.contains("av")) {
                    System.out.println(x);
                }
            }
        }


    }
}
