
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=Integer.valueOf(scanner.nextLine());
        int num2=Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(num1,num2);

    }

    public static void divisibleByThreeInRange(int x,int y){
        for(int i=x;i<=y;i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }

}
