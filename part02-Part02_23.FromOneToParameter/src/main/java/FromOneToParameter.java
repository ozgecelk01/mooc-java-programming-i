import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=Integer.valueOf(scan.nextLine());
        printUntilNumber(num);
    }
    public static void printUntilNumber(int x){
        for(int i=1;i<=x;i++){
            System.out.println(i);
        }
    }

}
