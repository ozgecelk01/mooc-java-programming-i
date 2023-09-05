import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Name: ");
            String name=scanner.nextLine();
            if(name.isEmpty()){
                System.out.println("");
                break;
            }
            System.out.println("Duration: ");
            int duration=Integer.valueOf(scanner.nextLine());

            TelevisionProgram program=new TelevisionProgram(name,duration);
            programs.add(program);
        }
        System.out.println("Program's maximum duration? ");
        int number=Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram program : programs){
            if(program.getDuration() <= number){
                System.out.println(program.toString());
            }
        }
    }
}