package activity2;

public class ACTIVITY2 {

	public static void main(String[] args) {

        Item item1 = new Item("Guitar", 1500, 3);
        item1.buy();
        item1.buy();
        item1.buy();
        item1.returnItem();
        item1.logDetails();

        Item item2 = new Item("Keyboard", 2500, 3);
        item2.buy();
        item2.buy();
        item2.returnItem();
        item2.returnItem();
        item2.logDetails();

        Item item3 = new Item("Drums", 4000, 1);
        item3.returnItem();
        item3.returnItem();
        item3.returnItem();
        item3.logDetails();

        Item item4 = new Item("Piano", 7000, 1);
        item4.buy();
        item4.buy();
        item4.logDetails();
    }
}