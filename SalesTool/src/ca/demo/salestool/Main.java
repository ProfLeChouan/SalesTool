package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreetings();
		data.display();

	}

	private static void displayGreetings() {
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("this app shows sales data");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
	}
}
