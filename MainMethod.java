package com.method.task;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) {
		ATMSystem atm=new ATMSystem();
		System.out.println(atm.checkBalance());
		System.out.println("---------------------------------------");
		WithdrawAmount amt=new WithdrawAmount();
		System.out.println(amt.withdrawAmount());
		System.out.println("---------------------------------------");
		StudentResult s=new StudentResult();
		System.out.println(s.calculatePercentage(80, 90, 85));
		System.out.println("---------------------------------------");
		MobileRecharge mob=new MobileRecharge();
		System.out.println(mob.recharge(349.0));
		System.out.println("---------------------------------------");
		TempratureConverter tempc=new TempratureConverter();
		System.out.println(tempc.celsiusToFahrenheit(25));
		System.out.println("---------------------------------------");
		LoginSystem log=new LoginSystem();
		System.out.println(log.login("Shradha", "shradha123"));
		System.out.println("---------------------------------------");
		EcommerceDiscount discount=new EcommerceDiscount();
		System.out.println(discount.calculateDiscount(20.0));
		System.out.println("---------------------------------------");
		EmployeeSalary esalary=new EmployeeSalary();
		System.out.println(esalary.calculateSalary(50000.0));
		System.out.println("---------------------------------------");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("1.Pizza - Rs.150");
//		System.out.println("2.Burger - Rs.100");
//		System.out.println("3.Dosa - Rs.70");
//		System.out.println("4.Coffee - Rs.60");
//		System.out.println("Enter item name :");
//		String item=sc.nextLine();
//		System.out.println("Enter quantity :");
//		int quantity=sc.nextInt();
//		FoodOrdering fd=new FoodOrdering();
//		fd.placeOrder(item, quantity); 
		System.out.println("---------------------------------------");
		OnlineVottingSystem ov=new OnlineVottingSystem();
		System.out.println(ov.vote(22));
		System.out.println("---------------------------------------");
		RideBookingApp ride=new RideBookingApp();
		System.out.println(ride.calculateFare(5.5));
		System.out.println("---------------------------------------");
		PasswordStrengthChecker password=new PasswordStrengthChecker();
		System.out.println(password.ckeckPassword("Shra1234"));
		System.out.println("---------------------------------------");
		LibrarySystem lab=new LibrarySystem();
		System.out.println(lab.issueBook("A.P.J Abadul Kalam", false));
		System.out.println("---------------------------------------");
		ShoppingCartTotal total=new ShoppingCartTotal();
		System.out.println(total.calculateTotal(1500, 1000, 2000));
		System.out.println("---------------------------------------");
		MaximumNumber maxNum=new MaximumNumber();
		System.out.println(maxNum.findMax(26, 89, 30));
		System.out.println("---------------------------------------");
		PrimeNumberChecker prime=new PrimeNumberChecker();
		System.out.println(prime.isPrime(21));
		System.out.println("---------------------------------------");
		PalindromeChecker p=new PalindromeChecker();
		System.out.println(p.isPalindrome(121));
		System.out.println("---------------------------------------");
		EvenOddCounter eno=new EvenOddCounter();
		eno.countEvenOdd(new int[]{2,5,8,6,10});
		System.out.println("---------------------------------------");
		GradeCalculator grade=new GradeCalculator();
		System.out.println(grade.grade(85));
		System.out.println("-------------------------------------");
		ElectricityBill bill=new ElectricityBill();
		System.out.println(bill.calculateBill(220));
		System.out.println("------------------------------------");
		BankInterest interest=new BankInterest();
		System.out.println(interest.calculateInterest(10000, 5, 2));
		
		
		
		
		
	}

}
