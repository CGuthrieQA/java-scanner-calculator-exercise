# input with scanner exercises

## Calculator
1. Create a project that has four methods; addition, subtraction, multiplication, and division.
All of these methods should take two numbers as parameters.

```java
package com.qa.main;

public class Calculator {
	
	// simple run
	
	public static void run() {
		ScannerController.scannerController();
	}
	
	// mathematics
	
	public double addition(double a, double b) {
		return (a + b);
	}

	public double subtraction(double a, double b) {
		return (a - b);
	}
	
	public double multiplication(double a, double b) {
		return (a * b);
	}
	
	public double division(double a, double b) {
		return (a / b);
	}
	
}
```

1. Create a method to ask the user which of the four methods they wish to use, then take the numbers as user input for the operation and output the result back to the user.

```java
package com.qa.main;

import java.util.Scanner;

public class Runner {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Calculator.run();
		
		// GI -> GO
		input.close();
		
		System.out.println("\ninput closed");

	}
	
}
```

```java
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
	

```