package org.task;

import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Programmes {

	// 4.Java Program for in taking two numbers using Scanner and printing their sum
	private void sumofTwoNumber4() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int num1 = s.nextInt();
		System.out.println("Enter the second Number");
		int num2 = s.nextInt();
		System.out.println("the sum is " + (num1 + num2));
	}

	// 5. Java program to check whether the given input number is even or odd
	private void evenOrOdd5() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = s.nextInt();
		if (num % 2 == 0) {
			System.out.println("the given number is even");
		} else {
			System.out.println("the given number is odd");
		}
	}

	// 6. Java program which prints the multiplication table of the given input
	// number
	private void table6() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int table = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(table + "*" + i + "=" + (table * i));
		}
	}

	// 7. Java program to print the area of a circle
	private void areaOfCircle() {
		Scanner s = new Scanner(System.in);
		System.out.print("Radius of Circle is ");
		double radius = s.nextDouble();
		System.out.println("Area of circle is " + Math.PI * (radius * radius));

	}

	// 8.java program to check whether the given character is a Vowel
	private void vowels() {
//		Scanner s = new Scanner (System.in);
//System.out.print("Enter a Letter :");
//char c = s.next().charAt(0);
//
//switch (c) {
//case 'a':
//	System.out.println(c+"is a vowel ");
//	break;
//case 'e':
//	System.out.println(c+"is a vowel ");
//	break;
//case 'i':
//	System.out.println(c+"is a vowel ");
//	break;
//case 'o':
//	System.out.println(c+"is a vowel ");
//	break;
//case 'u':
//	System.out.println(c+"is a vowel ");
//	break;
//case 'A':
//	System.out.println(c+"is a vowel ");
//	break;
//case 'E':
//	System.out.println(c+"is a vowel ");
//	break;
//case 'I':
//	System.out.println(c+"is a vowel ");
//	break;
//case 'O':
//	System.out.println(c+"is a vowel ");
//	break;
//case 'U':
//	System.out.println(c+"is a vowel ");
//	break;
//
//
//default:
//	System.out.println(c +" is not a Vowel ");
//	break;
//	

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any character:");

		char c = scanner.next().charAt(0);

		boolean isVowel = false;

		switch (c) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			isVowel = true;

		}

		if (isVowel == true) {
			System.out.println(c + " is a vowel");
		} else {
			System.out.println(c + " is not a vowel");
		}
	}

	// Java program to find the power of a number
	private void powerOfNumber() {
		int number = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		System.out.println("Enter the power");
		int power = s.nextInt();
		for (int i = 1; i <= power; i++) {
			number = number * num;
		}
//		while (i <= power) {
//			number = number * num;
//		}
		System.out.println(number);
	}

	// Java program to find the sum of first 100 numbers
	private void sumOfFirst() {
		int num = 0;
		for (int i = 1; i <= 100; i++) {
			num = num + i;
		}
		System.out.println(num);
	}
	
	//Java program which intakes 6 numbers as input and prints their average
	private void averageofSix() {
		int numbers=0;
		Scanner s = new Scanner (System.in);
	for (int i = 0; i < 6; i++) {
		numbers = s.nextInt();
	}
System.out.println(numbers/6);
	}
	

	public static void main(String[] args) {
		Programmes p = new Programmes();
		// p.sumofTwoNumber4();
		// p.evenOrOdd5();
		// p.table6();
		// p.areaOfCircle();
		// p.vowels();
		// p.powerOfNumber();
		//p.sumOfFirst();
		p.averageofSix();

	}
}
