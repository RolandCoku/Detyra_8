import java.util.Scanner;

public class Interface {

     private final Scanner scanner;
     public int actionNumber;

     public Interface(){
          this.scanner = new Scanner(System.in);
     }

     public void printMenu(){
          System.out.println("***************************************************\n");
          System.out.println("Choose the action you want to make: ");
          System.out.println("1 - Add a new item");
          System.out.println("2 - Search for an item");
          System.out.println("3 - Modify the data for an item");
          System.out.println("4 - Print all the information saved in the database");
          System.out.println("5 - Quit");
          System.out.println("***************************************************\n");

     }

     public void getActionNumber(){
          System.out.print("Pres the number corresponding to the action: ");
          actionNumber = scanner.nextInt();
     }

     public void closeScanner(){
          scanner.close();
     }

}
