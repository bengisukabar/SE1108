package lab1;
public class Item {

    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(Item otherItem) {
        this.name = otherItem.name;
        this.price = otherItem.price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSameItem(Item otherItem) {
        return this.name.equals(otherItem.name) && this.price == otherItem.price;
    }

    public void applyDiscount(double rate) {
        price = price * (1 - rate);
    }

    public String toString() {
        return "name: " + name + " price: " + price;
    }
}