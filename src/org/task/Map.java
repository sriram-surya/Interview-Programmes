package org.task;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> m = new LinkedHashMap<String,Integer>();
		m.put("English", 90);
		m.put("Tamil", 30);
		m.put("Raph", 50);
		m.put("Baki", 80);
		m.put("Goku", 40);
		m.put("Cat", 10);
		m.put("Vara", null);
		m.put("Maths", null);
	//	System.out.println(m);
		
		System.out.println(m.get(1));
		System.out.println(m.get("Baki"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		System.out.println();
		
		System.out.println("foreach");
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println(entry);
		}
		System.out.println();
		
		entrySet.forEach(e-> System.out.println(e));
		
		TreeMap<String, Integer> t = new TreeMap<>();
		
		
		t.putAll(m);
		
	
		Set<Entry<String, Integer>> e = t.entrySet();
		
		for (Entry<String, Integer> q : e) {
			System.out.println(q);
		}
		System.out.println();
		
		Iterator<Entry<String, Integer>> i = e.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println();
		e.forEach(e1 -> System.out.println(e1));
		
		
		 
			
		}
		
	}

