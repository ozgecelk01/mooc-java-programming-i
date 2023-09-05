
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name="";
        int sum=0;
        int total=0;
        while(true){
            String text=scanner.nextLine();
            if(text.isEmpty()){
                break;
            }
            total+=1;
            String arr[]=text.split(",");
            if(arr[0].length()>name.length()){
                name=arr[0];
            }
            sum+=Integer.valueOf(arr[1]);
        }
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: "+(double)sum/total);


    }
}
