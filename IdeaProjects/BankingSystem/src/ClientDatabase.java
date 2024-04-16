import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientDatabase {

    private static ClientDatabase instance = null;
    private final List<Client> clientList;
    private final Scanner scanner = new Scanner(System.in);
    private ClientDatabase(){
        clientList = new ArrayList<>();
    }
    public static ClientDatabase getInstance(){
        if (instance==null){
            instance = new ClientDatabase();
        }
        return instance;
    }
    public void addClient(Client newClient){
        clientList.add(newClient);
    }
    public List<Client> getClientList() {
        return clientList;
    }
    public int findClient(String name, String ID){
        for (Client client : clientList){
            if ((client.getName().equals(name))&&(client.getID().equals(ID))){
                return clientList.indexOf(client);
            }
        }
        return -1;
    }
    public void printClientList(){
        for (Client client : clientList){
            System.out.println("***********************************************\n");
            System.out.println(client);
        }
    }
    public void modifyClient(String name, String ID){
        boolean notDone = true;
        String parameterToChange;
        int clientToModifyIndex = findClient(name, ID);

        if (clientToModifyIndex != -1){
            System.out.println(clientList.get(clientToModifyIndex));
            while (notDone) {

                System.out.println("Please choose the parameter to change: ");
                System.out.println("Enter \"Done\" when finished modifying!");
                System.out.print("Parameter: ");
                parameterToChange = scanner.nextLine();
                switch (parameterToChange) {
                    case "Name":
                        System.out.print("Give the modified name of the client: ");
                        String modifiedName = scanner.nextLine();
                        clientList.get(clientToModifyIndex).setName(modifiedName);
                        break;
                    case "ID":
                        System.out.print("Give the modified ID of the client: ");
                        String modifiedID = scanner.nextLine();
                        clientList.get(clientToModifyIndex).setID(modifiedID);
                        break;
                    case "Total balance":
                        System.out.print("Give the new balance:");
                        double newBalance = scanner.nextDouble();
                        scanner.nextLine();
                        clientList.get(clientToModifyIndex).setTotalBalance(newBalance);
                        break;
                    case "Interest rate":
                        System.out.print("Give the new interest rate:");
                        double newInterestRate = scanner.nextDouble();
                        scanner.nextLine();
                        clientList.get(clientToModifyIndex).setInterestRate(newInterestRate);
                        break;
                    case "Done":
                        notDone = false;
                        break;
                    default:
                        System.out.println("Invalid parameter!");
                }
            }
        }else {
            System.out.println("Client could not be found!\nPlease check the information given!");
        }
    }

}
