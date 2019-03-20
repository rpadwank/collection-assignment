package com.capgemini.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Alex");
		names.add("Anna");
		names.add("Adam");
		names.add("Bob");
		names.add("Grant");
		names.clear();
		System.out.println(names.size());
		Iterator<String> it = names.iterator();
		while(it.hasNext())
		{
			String name = it.next();
			System.out.println(name);
		}
		
		for (String string : names) {
			System.out.println(string);
		}
	}

}
