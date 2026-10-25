package com.method.task;

public class PasswordStrengthChecker {
	public String ckeckPassword(String password) {
		if(password.length()>=8) {
			return "Strong password..!";
		}else {
			return "Weak password..!";
		}
	}

}
