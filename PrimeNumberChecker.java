package com.method.task;

public class PrimeNumberChecker {
	public boolean isPrime(int num) {
		System.out.print("Enter number is prime : ");
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=num;i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}

}
