package org.task;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		
		
		//Tables  1 to 5
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}	

		//calculate pass or fail & total Average
		int m1, m2, m3, m4, m5;
		String name;
		int Percentage;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Student Name : ");
		name = s.nextLine();
		m1 = s.nextInt();
		m2 = s.nextInt();
		m3 = s.nextInt();
		m4 = s.nextInt();
		m5 = s.nextInt();
		
		
		Percentage = (m1 + m2 + m3 + m4 + m5) / 5;

		if ((m1 >= 35) && (m2 >= 35) && (m3 >= 35) && (m4 >= 35) && (m5 >= 35)) {
			System.out.println("Student Name: " + name + "\n" + "M1: " + m1 + "\n" + "M2: " + m2 + "\n" + "M3: " + m3
					+ "\n" + "M4: " + m4 + "\n" + "M5: " + m5 + "\n" + "Total Marks :" + (m1 + m2 + m3 + m4 + m5) + "\n"
					+ Percentage + "%" + "\n" + "Passed in all Subject");}
		
			else if ((Percentage >= 90) && (Percentage <= 100)) {
			System.out.println("Grade A");
		}
			else	if ((Percentage >= 80) && (Percentage <= 90)) {
			System.out.println("Grade B");
		}
			else if ((Percentage >= 70) && (Percentage <= 80)) {
			System.out.println("Grade C");
		}
			else	if ((Percentage >= 60) && (Percentage <= 70)) {
			System.out.println("Grade D");
		}
		
		else {
			System.out.println("Student Name: " + name + "\n" + "M1: " + m1 + "\n" + "M2: " + m2 + "\n" + "M3: " + m3
					+ "\n" + "M4: " + m4 + "\n" + "M5: " + m5 + "\n" + "Total Marks :" + (m1 + m2 + m3 + m4 + m5) + "\n"
					+ Percentage + "%" + "\n" + "failed"+"\n"+"Grade U");
		}
		

	Scanner s1 = new Scanner(System.in);
	System.out.print("Student Name : ");
	String name1 = s.nextLine();
	System.out.print(name1 + "Scroed in M1 : ");
	int m11 = s.nextInt();
	System.out.print(name1 + "Scroed in M2 : ");
	int m21 = s.nextInt();
	System.out.print(name1 + "Scroed in M3 : ");
	int m31 = s.nextInt();
	System.out.print(name1 + "Scroed in M4 : ");
	int m41 = s.nextInt();
	System.out.print(name1 + "Scroed in M5 : ");
	int m51 = s.nextInt();

	if (m11 >= 35) {
		System.out.println("M1 pass");
		if (m21 >= 35) {
			System.out.println("M2 pass");
			if (m31 >= 35) {
				System.out.println("M3 pass");
				if (m41 >= 35) {
					System.out.println("M4 pass");
					if (m51 >= 35) {
						System.out.println("M5 pass");
						System.out.println("Total Marks scored by " + name + " " + (m11 + m21 + m31 + m41 + m51) / 5+"%");
					}
				}
			}
		}
	} else {
		System.out.println(name1 + " failed");
	}
}


}
