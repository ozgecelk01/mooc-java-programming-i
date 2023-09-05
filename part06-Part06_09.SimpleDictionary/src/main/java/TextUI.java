import java.util.Scanner;
public class TextUI {
    private Scanner scan;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scan, SimpleDictionary simpleDictionary) {
        this.scan = scan;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scan.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word:");
                String word = scan.nextLine();
                System.out.println("Translation:");
                String translation = scan.nextLine();
                simpleDictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated:");
                String translated = scan.nextLine();
                String returnTranslation = simpleDictionary.translate(translated);
                if (returnTranslation == null) {
                    System.out.println("Word " + translated + " was not found");
                } else {
                    System.out.println(returnTranslation);
                }
            } else {
                System.out.println("Unknown command");
                continue;
            }
        }

    }
}