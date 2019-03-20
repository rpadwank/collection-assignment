package com.capgemini.laptop.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.laptop.model.Laptop;

public class LaptopTest {

	private Laptop dellLaptop;
	private Laptop acerLaptop;
	private Laptop hpLaptop;
	
	@Before
	public void setUp()
	{
		dellLaptop = new Laptop("Dell", "XPS", "Windows 10", "i5");
		acerLaptop = new Laptop("Acer", "Aspire", "Windows 10", "i5");
		hpLaptop = new Laptop("HP", "Notebook", "Ubuntu", "i7");
	}
	
	@Test
	public void testLaptopToCheckInsertionOrderInArrayList() {
		ArrayList<Laptop> laptop = new ArrayList<>();
		laptop.add(dellLaptop);
		laptop.add(acerLaptop);
		laptop.add(hpLaptop);
		
		Iterator<Laptop> iterator = laptop.iterator(); 
		assertEquals(dellLaptop, iterator.next());
		assertEquals(acerLaptop, iterator.next());
		assertEquals(hpLaptop, iterator.next());
	}
	
	@Test
	public void testLaptopToCheckNaturalOrderInHashSet() {
		HashSet<Laptop> laptop = new HashSet<>();
		laptop.add(dellLaptop);
		laptop.add(acerLaptop);
		laptop.add(hpLaptop);
		laptop.add(hpLaptop);
		 
		assertEquals(3, laptop.size());
	}

}
