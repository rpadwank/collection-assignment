package com.capgemini.car.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.car.model.Car;

public class CarTest {

	private Car suzukiCar;
	private Car tataCar;
	private Car chevroletCar;
	
	
	
	@Before
	public void setUp()
	{
		suzukiCar = new Car("Suzuki", "WagonR", 2016, 250000);
		tataCar = new Car("Tata", "Hexa", 2018, 850000);
		chevroletCar = new Car("Chevrolet", "Tavera", 2015, 650000);
	}
	
	@Test
	public void testCarToCheckInsertionOrderInArrayList()
	{
		ArrayList<Car> car = new ArrayList<>();
		car.add(suzukiCar);
		car.add(tataCar);
		car.add(chevroletCar);
		
		Iterator<Car> iterator = car.iterator();
		
		assertEquals(suzukiCar, iterator.next());
		assertEquals(tataCar, iterator.next());
		assertEquals(chevroletCar, iterator.next());
	}
	
	@Test
	public void testCarForDuplicatesInHashSet() {
		HashSet<Car> car = new HashSet<>();
		car.add(suzukiCar);
		car.add(chevroletCar);
		car.add(tataCar);
		car.add(tataCar);
		 
		assertEquals(3, car.size());
	}
	
	@Test
	public void testCarWithImplementingComparableAndOrderThemInAscending()
	{
		TreeSet<Car> car = new TreeSet<Car>();
		car.add(suzukiCar);
		car.add(chevroletCar);
		car.add(tataCar);
		
		Iterator<Car> iterator = car.iterator();
		assertEquals(chevroletCar, iterator .next());
		assertEquals(suzukiCar, iterator .next());
		assertEquals(tataCar, iterator .next());
	}

}
