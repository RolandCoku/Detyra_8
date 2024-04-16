public class Item {
    private String itemName;
    private String itemID;
    private int itemCount;
    private int itemPrice;

    public Item(String name, String ID, int count, int price) {
        itemName = name;
        itemID = ID;
        itemCount = count;
        itemPrice = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String name){
        itemName = name;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String ID){
        itemID = ID;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int count){
        itemCount = count;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int Price) {
        itemPrice = Price;
    }

    @Override
    public String toString(){
        return "Name: " + itemName + "\n" + "ID: " + itemID + "\n" + "Count: " + itemCount + "\n" + "Price: " + itemPrice;
    }

}
