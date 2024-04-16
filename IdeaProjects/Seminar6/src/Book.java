//Krijoni klasen Book, qe permban
//o Fusha private name, author, price, qty
//o metodat get/set per keto fusha.
public class Book {
    private String name;
    private Author author;
    private int price;
    private int qty;

    public Book(String name, Author author, int price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
