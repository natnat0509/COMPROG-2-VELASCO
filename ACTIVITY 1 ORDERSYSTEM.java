package ordersystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        try (Scanner scan = new Scanner(System.in)) {
			String[] instruments = new String[1];
			int[] quantities = new int[1];
			double[] prices = new double[1];
			int orderCount = 0;

			int  guitar=150;
			
			double totalMoney = 0;

			while (true) {
			    System.out.println("\n--- VELASCO INSTRUMENT'S SHOP ---");
			    System.out.println("1. Add Order");
			    System.out.println("2. List of Orders");
			    System.out.println("3. Exit system");
			    System.out.print("\nChoose number: ");
			    int choice = scan.nextInt();
			    scan.nextLine();

			    if (choice == 1) {
			    	System.out.println("\n LIST: ");
			        System.out.println(" Guitar ");
			        System.out.println(" Drums set ");
			        System.out.println(" keyboard ");
			        System.out.println(" Piano ");
			        System.out.println(" Saxophone ");
			        System.out.print("\nCHOOSE INSTRUMENT: ");
			        String pick = scan.nextLine();

			        System.out.println("YOU CHOOSE: "+ pick);
			        System.out.print("\nQUANTITY: ");
			        int qty = scan.nextInt();

			        System.out.println("ITEMS::"+qty+"PCS"+ " = " +"₱"+guitar+" Per pcs");
			        System.out.println("\nKINDLY TYPE THE NUMBER ON YOUR SCREEN");
			        double price = scan.nextDouble();
			       		        
			        instruments[orderCount] = pick;
			        quantities[orderCount] = qty;
			        prices[orderCount] = price;

			        totalMoney += qty * price;
			        orderCount++;

			        System.out.println("\nYOUR ORDER HAS BEEN ADDED");
			    } 
	            else if (choice == 2) {
	                if (orderCount == 0) {
	                    System.out.println("No orders yet.");
	                } else {
	                    System.out.println("\nOrders:");
	                    for (int i = 0; i < orderCount; i++) {
	                        double subtotal = quantities[i] * prices[i];
	                        System.out.println(instruments[i] + " x" + quantities[i] +
	                                           " @ " + prices[i] + " each = " + subtotal);
	                    }
	                    System.out.println("Total Money: " + totalMoney);
	                }
	            } 
	            else if (choice == 3) {
	                System.out.println("Goodbye!");
	                break;
	            } 
	            else {
	                System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	}
}