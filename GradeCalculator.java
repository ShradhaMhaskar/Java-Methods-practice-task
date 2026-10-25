package com.method.task;

public class GradeCalculator {
	public String grade(int marks) {
		if(marks<0||marks>100) {
			return "Invalid Marks";
		}else if(marks>=80) {
			return "A";
		}else if(marks>=60) {
			return "B";
		}else if(marks>=40) {
			return "C";
		}else {
			return "F";
		}
	}

}
