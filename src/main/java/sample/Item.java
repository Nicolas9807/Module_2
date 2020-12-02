package sample;

public class Item {
    public enum ItemType { NEW, REGULAR, SECOND_FREE, SALE }
    public String title;
    public double price;
    public int quantity;
    public ItemType type;

    public Item(String title, double price, int quantity, Item.ItemType type){
        this.title = title;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }
}
