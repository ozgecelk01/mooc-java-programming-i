
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int total=0;
        double average;
        while(true){
            System.out.println("Give a number:");
            int num=Integer.valueOf(scanner.nextLine());
            if(num==0){
                break;
            }
            sum+=num;
            total+=1;
        }
        System.out.println("Average of the numbers: "+(double)sum/total);

    }
}
