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
