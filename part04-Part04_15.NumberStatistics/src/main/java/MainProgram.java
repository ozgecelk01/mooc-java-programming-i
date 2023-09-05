
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics a=new Statistics();
        Statistics b=new Statistics();
        Statistics c=new Statistics();
        System.out.println("Enter numbers:");
        while(true){
            int number=Integer.valueOf(scanner.nextLine());
            if(number==-1){
                break;
            } else{
                a.addNumber(number);
                if(number%2==0){
                    b.addNumber(number);
                } else{
                    c.addNumber(number);
                }
            }
        }
        System.out.println("Sum: "+a.sum());
        System.out.println("Sum of even numbers: "+b.sum());
        System.out.println("Sum of odd numbers: "+c.sum());

    }
}
