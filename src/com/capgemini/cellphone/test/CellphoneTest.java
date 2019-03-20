package com.capgemini.cellphone.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.cellphone.model.Cellphone;

public class CellphoneTest {

	private static Cellphone samsung;
	private static Cellphone xiaomi;
	private static Cellphone apple;
	
	@BeforeClass
	public static void setUp()
	{
		samsung = new Cellphone("Samsung", "Note 7", "4 GB RAM", "Android 9.0", 35000 );
		xiaomi = new Cellphone("Xiaomi", "Note 7 Pro", "4 GB RAM", "Android 9.0", 10000 );
		apple = new Cellphone("Apple", "iPhone 10", "8 GB RAM", "iOS 10", 75000);
	}
	
	@Test
	public void testCellphoneToCheckInsertionOrderInArrayList() {
		ArrayList<Cellphone> cellphone = new ArrayList<>();
		cellphone.add(samsung);
		cellphone.add(xiaomi);
		cellphone.add(apple);
		
		Iterator<Cellphone> iterator = cellphone.iterator();
		
		assertEquals(samsung, iterator.next());
		assertEquals(xiaomi, iterator.next());
		assertEquals(apple, iterator.next());
	}
	
	@Test
	public void testCellphoneToCheckDuplicatesInHashSet() {
		HashSet<Cellphone> cellphone = new HashSet<>();
		cellphone.add(samsung);
		cellphone.add(xiaomi);
		cellphone.add(apple);
		cellphone.add(apple);
		 
		assertEquals(3, cellphone.size());
	}

}
