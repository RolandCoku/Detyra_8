import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    private final List<Item> itemList;
    private final Scanner scanner;
    public Database(){
        itemList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addItem(Item newItem){
        itemList.add(newItem);
    }

    public void findItem(){
        String searchName = scanner.nextLine();
        boolean itemFound = false;
        for (Item item : itemList){
            if (item.getItemName().equals(searchName)){
                System.out.println(item);
                itemFound = true;
            }
        }
        if (!itemFound){
            System.out.println("Item not found!");
        }
    }

    public void modifyItem(){
       String searchName = scanner.nextLine();
       boolean itemFound = false;
        for (Item item : itemList){
            if (item.getItemName().equals(searchName)){
                itemFound = true;
                System.out.println(item + "\n");
                System.out.println("Choose the parameter of the item you want to change: ");
                String parameterToChange = scanner.nextLine();
                switch (parameterToChange){
                    case "Name":
                        System.out.println("Enter the new name: ");
                        String newName = scanner.nextLine();
                        item.setItemName(newName);
                        break;
                    case "ID":
                        System.out.println("Enter the new ID: ");
                        String newID =scanner.nextLine();
                        item.setItemID(newID);
                        break;
                    case "Count":
                        System.out.println("Enter the new count: ");
                        int newCount = scanner.nextInt();
                        scanner.nextLine();
                        while (newCount < 0){
                            System.out.println("Invalid price!\n");
                            System.out.println("Enter the new count: ");
                            newCount = scanner.nextInt();
                            scanner.nextLine();
                        }
                        item.setItemCount(newCount);
                        break;
                    case "Price":
                        System.out.println("Enter the new price");
                        int newPrice = scanner.nextInt();
                        scanner.nextLine();
                        while (newPrice < 0){
                            System.out.println("Invalid price!\n");
                            System.out.println("Enter the new price");
                            newPrice = scanner.nextInt();
                            scanner.nextLine();
                        }
                        item.setItemPrice(newPrice);
                        break;
                    default: System.out.println("Invalid parameter!");
                }
            }
        }
        if (!itemFound){
            System.out.println("Item not found!");
        }
    }

    public void displayItems(){
        for (Item item : itemList){
            System.out.println(item);
            System.out.println("---------------------------------------------------");
        }
    }

    public void closeScanner(){
        scanner.close();
    }
}
