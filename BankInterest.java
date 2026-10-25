package com.method.task;

public class BankInterest {
	public double calculateInterest(double principal,double rate,int time) {
		System.out.print("Interest : ");
		double interest=(principal*rate*time)/100;
		return interest;
	}

}
