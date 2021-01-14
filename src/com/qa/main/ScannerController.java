package com.qa.main;

public class ScannerController {

	
	// Scanner controller
	
	public static void scannerController() {
		
		//make a new calculator
		Calculator calc = new Calculator();
		
		System.out.println("Scanner is running.");
		
		// variables
		String result;
		double a;
		double b;
		
		System.out.println("\nEnter first number:");
		
		result = Runner.input.nextLine();
		a = Double.parseDouble(result);
		
		System.out.println("\nEnter second number:");
		
		result = Runner.input.nextLine();
		b = Double.parseDouble(result);
		
		System.out.println("\nWhat method would you like to use?\rADDITION\rSUBTRACTION\rMULTIPLICATION\rDIVISION\n");
		
		result = Runner.input.nextLine();
		
		switch(result) {
			case "ADDITION":
				System.out.println("\n" + a +  " + " + b + " = " + calc.addition(a, b));
				break;
			case "SUBTRACTION":
				System.out.println("\n" + a +  " - " + b + " = " + calc.subtraction(a, b));
				break;
			case "MULTIPLICATION":
				System.out.println("\n" + a +  " * " + b + " = " + calc.multiplication(a, b));
				break;
			case "DIVISION":
				System.out.println("\n" + a +  " / " + b + " = " + calc.division(a, b));
				break;
			default:
				System.out.println("unknown entry");
				break;
		}
			
	}
		
}
	
