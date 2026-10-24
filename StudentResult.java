package com.method.task;

public class StudentResult {
	public double calculatePercentage(int m1, int m2, int m3) {
		int total=m1 + m2 + m3;
		double percentage = (total / 300.0)*100;
		System.out.println("Total marks : " + total);
		System.out.print("Percentage : " );
		return percentage ;
	}

}
