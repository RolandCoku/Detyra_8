//Te ndertohet nje program qe mban informacion per artikujt qe mbahen ne nje magazine.
//1. (Shtim) Shtimi i nje artikulli te ri (numri i artikullit, emri, gjendja).
//2. (Kerkim) Nese na jepet numri i nje artikulli, te kerkohet ne databaze dhe nese egziston, te
//    shfaqet emri dhe gjendja e tij.
//3. (Modifikim) Nese na jepet numri i nje artikulli, te mund te modifikohet gjendja e tij.
//4. (Printim) Te printoje ne forme te rregullt gjithe informacionin e databazes.
//5. Te perfundoje egzekutimin e programit.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Interface userInterface = new Interface();
        Database database = new Database();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        do {
            userInterface.printMenu();
            userInterface.getActionNumber();

            switch (userInterface.actionNumber){
                case 1:
                    System.out.println("Please give the details for the item you want to add: ");
                    System.out.println("------------------------------------------------------");
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item ID: ");
                    String itemID = scanner.nextLine();
                    System.out.print("Enter item count: ");
                    int itemCount = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter item price: ");
                    int itemPrice = scanner.nextInt();
                    scanner.nextLine();
                    Item item1 = new Item(itemName, itemID, itemCount, itemPrice);
                    database.addItem(item1);
                    break;
                case 2:
                    System.out.println("Please give the name of the item you want to search for: ");
                    System.out.println("------------------------------------------------------");
                    database.findItem();
                    break;
                case 3:
                    System.out.println("Please give the name of the item you want to modify: ");
                    System.out.println("------------------------------------------------------");
                    database.modifyItem();
                    break;
                case 4:
                    System.out.println("Printing the information saved for every item: ");
                    System.out.println("------------------------------------------------------");
                    database.displayItems();
                    break;
                case 5:
                    scanner.close();
                    database.closeScanner();
                    isRunning = false;
            }

        } while (isRunning);



    }
}