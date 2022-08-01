package Main;

import java.util.Scanner;

public class Calculator {
	
	private Scanner scn = new Scanner(System.in);
	
	private double firstNumber;
	private double secondNumber;
	
	private void choice() {
		System.out.println("Enter fist number:");
		firstNumber = scn.nextDouble();

		System.out.println("Enter second number:");
		secondNumber = scn.nextDouble();
	}
	
	public double Addition() {
		this.choice();
		return firstNumber + secondNumber;
	}
	
	public double Subtraction() {
		this.choice();
		return firstNumber - secondNumber;
	}
	
	public double Multiplication() {
		this.choice();
		return firstNumber * secondNumber;
	}
	
	public double Division() {
		this.choice();
		return firstNumber / secondNumber;
	}

}
