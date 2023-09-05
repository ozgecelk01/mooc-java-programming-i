import java.util.Scanner;
public class LiquidContainers {
    public static void main(String[] args) {
        int first=0;
        int second=0;
        int max=100;
        Scanner scan = new Scanner(System.in);

        System.out.println("First: " + first + "/" + max);
        System.out.println("Second: " + second + "/" + max);


        while (true) {
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] word=input.split(" ");
            String a=word[0];
            int b=Integer.valueOf(word[1]);
            if(a.equals("add") && b>=0){
                if(first<=max){
                    first+= b;
                    if(first>=max){
                        first=max;
                    }
                }
            }
            else if(a.equals("move") && b>=0){
                if(first-b>=0){
                    second+=b;
                    first-=b;
                    if(second>=max){
                        second=max;
                    }
                }
                else if(first-b<0){
                    second+=first;
                    first=0;
                    if(second>=max){
                        second=max;
                    }
                }
            }
            else if(a.equals("remove") && b>=0){
                if(second-b >= 0){
                    second-=b;
                }
                else if(second-b<0){
                    second=0;
                }
            }
            System.out.println("First: " + first + "/" + max);
            System.out.println("Second: " + second + "/" + max);


        }
    }

}
