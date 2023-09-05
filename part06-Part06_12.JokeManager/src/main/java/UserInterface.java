import java.util.Scanner;

public class UserInterface {
    private JokeManager joke;
    private Scanner scan;

    public UserInterface(JokeManager joke, Scanner scan){
        this.joke=joke;
        this.scan=scan;
    }

    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke\n" + " 2 - draw a joke\n" + " 3 - list jokes\n" + " X - stop");
            String a=scan.nextLine();
            if(a.equals("X")){
                break;
            }
            else if(a.equals("1")){
                System.out.println("Write the joke to be added:");
                String j=scan.nextLine();
                joke.addJoke(j);
            }
            else if(a.equals("2")){
                System.out.println("Drawing a joke.");
                String drawnJoke = joke.drawJoke();
                System.out.println(drawnJoke);
            }
            else if(a.equals("3")){
                System.out.println("Printing the jokes.");
                joke.printJokes();
            }
        }
    }
}
