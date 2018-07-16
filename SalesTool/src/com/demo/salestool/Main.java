package com.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();

		dispalyGreeting();
		data.display();
	}

	private static void dispalyGreeting() {
		System.out.println("HELLO HAPPY SALES PEAPLE!");
		System.out.println("THIS APP SHOW SALES DATA");
	}
}
