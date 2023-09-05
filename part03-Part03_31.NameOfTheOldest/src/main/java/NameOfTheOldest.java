
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest =0;
        String part="";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                return;
            }
            String[] parts = input.split(",");
            if (Integer.valueOf(parts[1]) > oldest) {
                oldest = Integer.valueOf(parts[1]);
                part=parts[0];

            }
            System.out.println("Name of the oldest: "+part);
        }
    }
}
