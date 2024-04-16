import java.util.Scanner;
public class BankerInterface {
    private final ClientDatabase clientDatabase = ClientDatabase.getInstance();
    private final Scanner scanner = new Scanner(System.in);
    public BankerInterface(){
    }
    public void displayBankerInterface(boolean isRunning){
        System.out.println("Welcome to myBank!");
        System.out.println("*****************************************************************");

        while (isRunning){
            System.out.println("MENU");
            System.out.println("1-Add a new clint");
            System.out.println("2-Modify a clients information");
            System.out.println("3-Display clients information");
            System.out.println("4-List all the clients");
            System.out.println("5-Exit\n");

            System.out.print("Choose the corresponding number to the action: ");
            int actionNumber = scanner.nextInt();
            scanner.nextLine();

            switch (actionNumber){
                case 1:
                    String name = "";
                    while (true){
                        System.out.println("Give the information about the new client: ");
                        System.out.print("Name: ");
                        try {
                            if(scanner.hasNextLine()){
                                name = scanner.nextLine();
                            }
                            if(name.trim().isEmpty()){
                                System.out.println("Name can not be empty!");
                            } else {
                                break;
                            }
                        }catch (java.util.InputMismatchException e){
                            System.out.println("Invalid input! "+e.getMessage());
                            scanner.nextLine();
                        }
                    }
                    String ID = "";
                    while (true){
                        System.out.print("ID: ");
                        try {
                            if (scanner.hasNextLine()){
                                ID = scanner.nextLine();
                            }
                            if (ID.trim().isEmpty()){
                                System.out.println("ID cannot be empty!");
                            } else {
                                break;
                            }
                        } catch (java.util.InputMismatchException e){
                            System.out.println("Invalid input! "+e.getMessage());
                            scanner.nextLine();
                        }
                    }
                    System.out.print("Balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Interest rate: ");
                    double interestRate = scanner.nextDouble();
                    scanner.nextLine();
                    clientDatabase.addClient(new Client(name, ID, balance, interestRate));
                    break;
                case 2:
                    System.out.println("Enter the Name and ID of the client you want to modify.");
                    System.out.print("Name: ");
                    String searchName = scanner.nextLine();
                    System.out.print("ID: ");
                    String searchID = scanner.nextLine();
                    clientDatabase.modifyClient(searchName, searchID);
                    break;
                case 3:
                    System.out.println("Enter the Name and ID of the client.");
                    System.out.print("Name: ");
                    searchName = scanner.nextLine();
                    System.out.print("ID: ");
                    searchID = scanner.nextLine();
                    if (clientDatabase.findClient(searchName,searchID) != -1){
                        System.out.print(clientDatabase.getClientList().get(clientDatabase.findClient(searchName,searchID)));
                    }else {
                        System.out.println("Client not found!");
                    }
                    break;
                case 4:
                    System.out.println("Printing client list...");
                    clientDatabase.printClientList();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("INVALID INPUT");
            }
        }
    }
}
