package com.method.task;

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
		
		
		
		
	}

}
