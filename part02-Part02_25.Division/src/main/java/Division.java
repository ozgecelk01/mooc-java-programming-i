import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1=Integer.valueOf(scan.nextLine());
        int num2=Integer.valueOf(scan.nextLine());
        division(num1,num2);

    }

    public static void division(int x,int y){
        System.out.println((double)x/y);
    }
}
