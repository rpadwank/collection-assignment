package com.capgemini.television.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.television.model.Television;


public class TelevisionTest {

	private Television samsungTelevision;
	private Television xiaomiTelevision;
	private Television panasonicTelevision;
	
	@Before
	public void setUp()
	{
		samsungTelevision = new Television("Samsung", "LED", true, 50000);
		xiaomiTelevision = new Television("Samsung", "LED", true, 50000);
		panasonicTelevision = new Television("Panasonic", "Plasma", false, 25000);
	}
	
	@Test
	public void testTelevisionToCheckInsertionOrderInArrayList() {
		ArrayList<Television> television = new ArrayList<>();
		television.add(samsungTelevision);
		television.add(xiaomiTelevision);
		television.add(panasonicTelevision);
		
		Iterator<Television> iterator = television.iterator(); 
		assertEquals(samsungTelevision, iterator.next());
		assertEquals(xiaomiTelevision, iterator.next());
		assertEquals(panasonicTelevision, iterator.next());
	}
	
	@Test
	public void testTelevisionToCheckDuplicatesInHashSet() {
		HashSet<Television> television = new HashSet<>();
		television.add(samsungTelevision);
		television.add(xiaomiTelevision);
		television.add(panasonicTelevision);
		television.add(panasonicTelevision);
		 
		assertEquals(2, television.size());
	}

}
