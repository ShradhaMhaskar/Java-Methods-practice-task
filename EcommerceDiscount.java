package com.method.task;

public class EcommerceDiscount {
	public double calculateDiscount(double price) {
		double originalPrice=1000.0;
		double discountPrice=originalPrice*price/100;
		double finalPrice=originalPrice-discountPrice;
		System.out.print("Final price after getting discount : ");
		return finalPrice;
	}

}
