
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("First name: ");
            String name=scanner.nextLine();
            if(name.isEmpty()){
                System.out.println("");
                break;

            }
            System.out.println("Last name: ");
            String surname=scanner.nextLine();
            System.out.println("Identification number: ");
            String number=scanner.nextLine();
            PersonalInformation per=new PersonalInformation(name,surname,number);
            infoCollection.add(per);

        }
        for (PersonalInformation item : infoCollection) {
            System.out.println(item.getFirstName() + " " + item.getLastName());
        }

    }
}
