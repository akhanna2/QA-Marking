package Main;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		boolean running = true;

		Calculator calc = new Calculator();
		try (Scanner scn = new Scanner(System.in)) {
			while (running) {

				double result;

				System.out.println("Welcome to my calculator app!");
				System.out.println("Please select the function you would like to perform:");
				System.out.println("1. Addition");
				System.out.println("2. Subtractio");
				System.out.println("3. Multiplication");
				System.out.println("4. Division");
				System.out.println("5. Exit");

				int choice = scn.nextInt();

				if (choice == 5) {
					running = false;
				} else {

					switch (choice) {
					case 1:
						result = calc.Addition();
						System.out.println("The result is " + result);
						break;
					case 2:
						result = calc.Subtraction();
						System.out.println("The result is " + result);
						break;
					case 3:
						result = calc.Multiplication();
						System.out.println("The result is " + result);
						break;
					case 4:
						result = calc.Division();
						System.out.println("The result is " + result);
						break;
					default:
						System.out.println("Please enter a valid choice! \n");
						break;
					}
				}
			}

		}

	}

}
