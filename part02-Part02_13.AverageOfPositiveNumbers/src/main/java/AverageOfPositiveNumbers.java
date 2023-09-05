
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int total=0;
        while(true){
            int num=Integer.valueOf(scanner.nextLine());
            if(num==0){
                break;
            } else if(num>0) {
                sum += num;
                total += 1;
            }

        }
        if(total==0){
            System.out.println("Cannot calculate the average");
        } else{
            System.out.println((double)sum/total);
        }
    }
}
