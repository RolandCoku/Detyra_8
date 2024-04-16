import java.util.Scanner;

public class ClientInterface {

    private final ClientDatabase clientDatabase = ClientDatabase.getInstance();
    private boolean accessGranted;
    private int clientIndex;
    private final Scanner scanner = new Scanner(System.in);

    public ClientInterface(){
        this.accessGranted = false;
    }
    public void displayClientInterface(){

        System.out.println("Welcome to myBank!");
        System.out.println("*****************************************************************");

        while (!accessGranted){
            System.out.println("Please give your name and ID to log in!");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            String ID = scanner.nextLine();
            if (clientDatabase.findClient(name, ID) == -1) {
                System.out.println("Could not find any client registered with this information!");
                System.out.print("Press 1 if you want to try again and 0 if you want to exit: ");
                int tryAgain = scanner.nextInt();
                scanner.nextLine();
                if (tryAgain == 0){
                    return;
                }
            } else {
                clientIndex = clientDatabase.findClient(name,ID);
                accessGranted = true;
            }
        }

        while (accessGranted){
            System.out.println("MENU");
            System.out.println("1-Deposit");
            System.out.println("2-Withdraw");
            System.out.println("3-Show transaction history");
            System.out.println("4-Show total balance");
            System.out.println("5-Exit\n");

            System.out.print("Choose the corresponding number to the action: ");
            int actionNumber = scanner.nextInt();
            scanner.nextLine();
            boolean validInput = false;

            switch (actionNumber){
                case 1:
                    double amountToDeposit = 0.0;
                    while (!validInput){
                        System.out.print("Give the amount of money you want to deposit: ");
                        try {
                            if (scanner.hasNextDouble()){
                                amountToDeposit = scanner.nextDouble();
                                scanner.nextLine();
                            }
                            if (amountToDeposit > 0){
                                validInput = true;
                            }else {
                                System.out.println("Deposited amount can not be 0 or less!\n");
                            }
                        } catch (java.util.InputMismatchException e){
                            System.out.println("Invalid input. Please enter a positive number!\n");
                            scanner.nextLine();
                        }
                        clientDatabase.getClientList().get(clientIndex).addDeposit(amountToDeposit);
                    }
                    break;
                case 2:
                    double amountToWithdraw = 0.0;
                    while (!validInput){
                        System.out.print("Enter the amount you want to withdraw: ");
                        try {
                            if (scanner.hasNextDouble()){
                                amountToWithdraw = scanner.nextDouble();
                                scanner.nextLine();
                            }

                            if (amountToWithdraw > 0){
                                validInput = true;
                            } else {
                                System.out.println("Amount to withdraw must be bigger than 0!");
                            }
                        }catch (java.util.InputMismatchException exception){
                            System.out.println("Invalid input! Please enter a positive number as your amount to withdraw!\n");
                            scanner.nextLine();
                        }
                    }
                    boolean withdrawApproved = false;
                    while (amountToWithdraw > clientDatabase.getClientList().get(clientIndex).getTotalBalance()){
                        System.out.println("Your total balance is not sufficient!");
                        System.out.println("Your total balance is"+clientDatabase.getClientList().get(clientIndex).getTotalBalance());
                        System.out.print("Enter a new amount to withdraw or enter 0 to exit:");
                        amountToWithdraw = scanner.nextDouble();
                        scanner.nextLine();
                        if (amountToWithdraw != 0){
                            withdrawApproved = true;
                        }
                    }
                    if (withdrawApproved){
                        clientDatabase.getClientList().get(clientIndex).withdraw(amountToWithdraw);
                    }
                    break;
                case 3:
                    System.out.println("Printing transaction history...");
                    clientDatabase.getClientList().get(clientIndex).printDepositHistory();
                    clientDatabase.getClientList().get(clientIndex).printWithdrawHistory();
                    break;
                case 4:
                    System.out.println("Your total balance is "+clientDatabase.getClientList().get(clientIndex).getTotalBalance());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    accessGranted = false;
                    break;
                default:
                    System.out.println("INVALID ACTION!");
            }
        }
    }
}
