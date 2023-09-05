
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {

    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int x:numbers){
            if(x<=upperLimit && x>=lowerLimit){
                System.out.println(x);
            }
        }
    }
}
