package org.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Array {
	

	public static void main(String[] args) {
//		int sum = 0;
//		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		 System.out.println(a.length);
//		 for (int i =0 ; i < a.length; i++) {
//			sum+=a[i];
//		}
//		 System.out.println("\n"+sum);
//		 
//		 System.out.println((double)sum/a.length);
//		
//		 
//		 List li = new ArrayList<>();
//		 li.add(10);
//		 li.add(20);
//		 li.add(30);
//		 li.add(90);
//		 li.add(10);
//		 li.add(40);
//		 li.add(50);
//		 System.out.println("\n"+li.size());
//		 
//		 System.out.println(li.indexOf(90));
//		 System.out.println(li.indexOf(20));
//		 System.out.println(li.lastIndexOf(10));
		 
		 List l1 = new ArrayList<>();
		 l1.add(100);
		 l1.add(200);
		 l1.add(100);
		 l1.add(500);
		 l1.add(300);
		 l1.add(400);
		 l1.add(500);
		 l1.add(600);
		 l1.add(700);
//	for (int i = 0; i < l1.size(); i++) {
//		System.out.println(l1.get(i));
//	}
//	
//	for (Object k : l1) {
//		System.out.println("\n"+k);
//	}
//	
//	l1.forEach(l->System.out.println(l));
//		
//	Iterator l = l1.iterator();
//		 while (l.hasNext()) {
//			 
//			System.out.println("\n"+l.next());
//		}
		 System.out.println(l1);
		 l1.remove(3);
		 System.out.println(l1);
		 l1.add(3,"String");
		 System.out.println(l1);
		 
		 Collections.replaceAll(l1, 100, 10);
		 System.out.println(l1);
		 
		List l2 = new ArrayList<>();
		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(900);
		l2.add(600);
		l2.add(100);
		l2.add(700);
		l2.add(50);
		l2.add(60);
		l2.add(0, "Zoo");
		System.out.println("\n"+l2);
		System.out.println(l2.get(3));
		l2.set(0, 300);
		System.out.println(l2);
	System.out.println(l2.indexOf(100));
		System.out.println(l2.lastIndexOf(100));
		l2.addAll(l1);
		System.out.println(l2.containsAll(l1));
		
		Iterator k = l2.iterator();
		while (k.hasNext()) {
			System.out.println(k.next());
		}
		
		l2.forEach(l-> System.out.println(l));
		
	//Collections.sort(l2);
		System.out.println(l2);
	Collections.sort(l2 , Collections.reverseOrder());
	System.out.println(l2);
	
		 
		
	}
			
		}
		 
	

