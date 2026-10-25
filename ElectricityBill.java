package com.method.task;

public class ElectricityBill {
	public double calculateBill(int units) {
		System.out.print("Total bill amount : ");
		double bill;
		if(units<=100) {
			bill=units*5;
		}else if(units<=200) {
			bill=(100*5)+(units-100)*7;
			
		}else {
			bill=(100*5)+(100*7)+(units-200)*10;
		}
		return bill;
	}

}
