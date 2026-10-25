package com.method.task;

import java.util.Scanner;

public class FoodOrdering {
	public void placeOrder(String item, int quantity) {
		int price=0;
		if (item.equals("Pizza")) {
			price = 150;
		} else if (item.equals("Burger")) {
			price = 100;
		} else if (item.equals("Dosa")) {
			price = 70;
		} else if (item.equals("Coffee")) {
			price = 60;
		} else {
			System.out.println("Item not available...!");
		
		}
		System.out.println("Item : " + item);
		System.out.println("Quantity : " + quantity);
		System.out.println("Price Rs : " + price);
		System.out.println("Total Bill : " + (price * quantity));

	}

}
