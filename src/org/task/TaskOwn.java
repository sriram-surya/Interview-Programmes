package org.task;

import java.util.Scanner;

import javax.management.StringValueExp;

public class TaskOwn {

	private static final String o = null;

	public static void main(String[] args) {

		String s1 = "Greens technology";
		String s2 = "SeleniumAutomationtool";
		String s3 = "velmurugan";
		String s4 = "j a v a p r o g r a m";
		String s5 = "9095484678";
		System.out.println(s1.length());
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s4.lastIndexOf(" "));
		System.out.println(s5.indexOf("8"));
		System.out.println(s1.charAt(10));
		System.out.println(s5.charAt(8));

		String u1 = "Java";
		String u2 = "java";
		System.out.println(u1.equals(u2));
		System.out.println(u1.equalsIgnoreCase(u2));

		String Email = "velmurugank451@gmail.com";
	//short Form Ternary Operator
		System.out.println((Email.contains("@")?"It is a Valid Email":"It is a InValid Email"));
		
		if (Email.contains("@")) {
			System.out.println("It is a Valid Email");
		} else {
			System.out.println("It is a inValid Email");
		}
		
		String address = "5-35-2a,venkatesh nivas,Aruppukottai";
		System.out.println(address.contains("pincode")?"Address is completed":"pincode is missing");
		
		//Get the phonenumber from the user and verify any character is present or not. If character is present return invalid number
//		Scanner s = new Scanner(System.in);
//		long phno = s.nextLong();
//		String c = String.valueOf(phno);
//		System.out.println(c.contains("[^0-9]")?"valid number":"Invalid Number");
		
		String r = "Welcome to java class";
		System.out.println(r.replace("java", "SQL"));
		System.out.println(r.replaceAll(" ", "#"));
		
		String u = "NISHANTHI";
		System.out.println(u.toLowerCase());
		
		//Find the number of uppercase count and lowercase count in the given String
		String f=  "WelComeToJava";
		System.out.println(f.startsWith("WelCome"));
		String replaceAll = f.replaceAll("[A-Z0-9]", "");
		System.out.println(replaceAll);
		String replaceAll2 = f.replaceAll("[a-z0-9]", "");
		System.out.println(replaceAll2);
		char[] charArray = replaceAll.toCharArray();
		char[] charArray2 = replaceAll2.toCharArray();
		System.out.println("LowerCase ="+
		charArray.length);
		System.err.println("UpperCase = "+charArray2.length);
		String w = "Welcome To Java class @123";
		String u11 = (w.replaceAll("[^0-9]", ""));
		System.out.println(u11);
		System.out.println("Number count = "+u11.length());
		String u12 = w.replaceAll("[^A-Z]", "");
		System.out.println(u12);
		System.out.println( "Capital count - "+u12.length());
		String u13 = w.replaceAll("[^a-z]", "");
		System.out.println(u13);
		System.out.println("Small count - "+u13.length());
		String u14 = w.replaceAll("[A-za-z0-9]", "");
		System.out.println(u14);
		System.out.println("Special character count -"+u14.length());
		String u15 = w.replaceAll("[aeiouAEIOU]", "@");
		System.out.println(u15);
		String u16 = w.replaceAll("[aeiouAEIOU]", "");
		System.out.println(u16.length());
		String u17 = w.replaceAll("[^aeiouAEIOU]", "");
		System.out.println(u17.length());

	
//		Scanner s = new Scanner (System.in);
//		System.out.println("Enter the names");		
//		for (int i = 0; i <=5; i++) {
//			String name = s.nextLine();
//			System.out.println(name+" - "+name.length());
//		}

		// Immutable String
//		System.out.println("Literal String");
//		String s1 = "java";
//		String s2 = "programm";
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		s1.concat(s2);
//		System.out.println(s1.hashCode());
//
//		System.out.println("Non literal String");
//		String s3 = new String("java");
//		String s4 = new String("java");
//		System.out.println(s3.hashCode());
//		System.out.println(s4.hashCode());
//		s3 = s3.concat(s4);
//		System.out.println(s3.hashCode());

		// Mutable String
//		StringBuffer s11 = new StringBuffer("Data Science");
//		System.out.println(s11.hashCode());
//		StringBuffer s22 = new StringBuffer("AI");
//		System.out.println(s22.insert(2, "- Artifical Intelligence"));
//		System.out.println(s22.hashCode());
//		s11=s11.append(s22);
//		System.out.println(s11.hashCode());

	}
}