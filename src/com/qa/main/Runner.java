package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		//setting grades for student1
		Results student1= new Results();
		student1.setBiology(100);
		student1.setChemistry(102);
		student1.setPhysics(99);
		student1.reportCard();
		student1.percentage();
		System.out.println("Overall Percentage: " + student1.percentage + "%");

	}

}
