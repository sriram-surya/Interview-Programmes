package org.task;

import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number of student : ");
		int noOfStudent = s.nextInt();
		int marks;
	//	int total = 0, Percentage = 0;
//
//		for (int i = 1; i <= noOfStudent; i++) {
//			System.out.print("Enter the Student name : ");
//			String Name = s.next();
//			for (int j = 1; j <= 5; j++) {
//				marks = s.nextInt();
//				total += marks;
//			}
	
	
	for (int i = 1; i <= noOfStudent; i++) {
		int total = 0,Percentage = 0;
		System.out.print("Enter the Student name : ");
		String Name = s.next();
		System.out.println("Enter marks");
		for (int j = 1; j <= 5; j++) {
			int marks1 = s.nextInt();
			total += marks1;//Total=total+marks
		}
		System.out.println(total);
	
			System.out.println("Total marks : " + total);
			System.out.println("Percentage : " + (Percentage = total / 5));
			if ((Percentage >= 90) && (Percentage <= 100)) {
				System.out.println("Grade A");
			} else if ((Percentage >= 80) && (Percentage <= 90)) {
				System.out.println("Grade B");
			} else if ((Percentage >= 70) && (Percentage <= 80)) {
				System.out.println("Grade C");
			} else if ((Percentage >= 60) && (Percentage <= 70)) {
				System.out.println("Grade D");
			}else {
				System.out.println("Fail");
			}
	}
		}
		


}
