package lab1;

public class ShoppingCart {

    private Item[] items;
    private int itemCount;
    private static int maxItems = 5;

    public ShoppingCart() {
        items = new Item[maxItems];
        itemCount = 0;
    }

    public void addItem(Item newItem) {

        for (int i = 0; i < itemCount; i++) {

            if (items[i].isSameItem(newItem)) {

                newItem.applyDiscount(0.20);
                System.out.println("Duplicate item detected. Discount applied.");
                break;
            }
        }

        if (itemCount < maxItems) {
            items[itemCount] = new Item(newItem);
            itemCount++;
        }
    }

    public void printCart() {

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item book = new Item("Book", 50);
        cart.addItem(book);

        Item duplicateBook = new Item(book);
        cart.addItem(duplicateBook);

        cart.addItem(new Item("Milk", 20));

        cart.printCart();
    }
}