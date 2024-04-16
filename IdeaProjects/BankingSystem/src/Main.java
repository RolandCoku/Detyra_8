//Creating a basic banking application is a great way to practice your Java skills, as having some grasp of the language will be needed to complete the project.
//
//This project will introduce you to many basic Java concepts like printing, variables, if/else statements, strings, loops, and more.
// You’ll create an application that allows a user to check a bank balance, deposit money, withdraw money, and exit the interface
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankerInterface bankerInterface = new BankerInterface();
        ClientInterface clientInterface = new ClientInterface();
        boolean isRunning = true;

        while (isRunning){
            System.out.println("1-Client");
            System.out.println("2-Banker");
            System.out.println("3-Quit");

            System.out.print("Choose if you want to sign in as a client or a banker: ");
            int actionNumber = scanner.nextInt();
            scanner.nextLine();
            switch (actionNumber){
                case 1:
                    clientInterface.displayClientInterface();
                    break;
                case 2:
                    bankerInterface.displayBankerInterface(true);
                    break;
                case 3:
                    System.out.println("Quiting...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("INVALID ACTION");
            }
        }
    }
}