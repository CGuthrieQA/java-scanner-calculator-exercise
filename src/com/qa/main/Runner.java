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
