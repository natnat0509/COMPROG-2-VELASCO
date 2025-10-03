package activity2;

public class Item {
	String item_name;
    double price;
    int sold;
    int stock;

    Item(String name, double price, int stock) {
        this.item_name = name;
        this.price = price;
        this.stock = stock;
        this.sold = 0;
    }

    void logDetails() {
        System.out.println("\nItem: " + item_name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println("Sold: " + sold);
    }

    void buy() {
        if (stock > 0) {
            stock--;
            sold++;
            System.out.println("Bought 1 " + item_name);
        } else {
            System.out.println("No stock left to buy!");
        }
    }

    void returnItem() {
        if (sold > 0) {
            stock++;
            sold--;
            System.out.println("Returned 1 " + item_name);
        } else {
            System.out.println("No sold items to return!");
        }
    }
}