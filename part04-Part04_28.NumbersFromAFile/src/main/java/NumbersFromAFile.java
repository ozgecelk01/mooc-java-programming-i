
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lines = new ArrayList<>();
        int total=0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try(Scanner scan=new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                lines.add(Integer.valueOf(scan.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for(int i: lines){
            if(i<=upperBound && i>=lowerBound){
                total+=1;
            }
        }
        System.out.println("Numbers: "+total);
    }

}
