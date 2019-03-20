package com.capgemini.student.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.student.model.Student;

public class StudentTest {

	private static Student student1;
	private static Student student2;
	private static Student student3;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		student1 = new Student("Bob",23);
		student2 = new Student("Alice",23);
		student3 = new Student("John",21);
	}

	@AfterClass
	public static void tearDownAfterClass() {
		student1 = null;
		student2 = null;
		student3 = null;
	}

	@Test
	public void testStudentToCheckInsertionOrderInArrayList() {
		ArrayList<Student> student = new ArrayList<>();
		
		student.add(student1);
		student.add(student2);
		student.add(student3);

		Iterator<Student> iterator = student.iterator();
		assertEquals("Bob", iterator.next().getStudentName());
		assertEquals("Alice", iterator.next().getStudentName());
		assertEquals("John", iterator.next().getStudentName());
		
	}
	
	@Test
	public void testStudentToCheckNaturalOrderInTreeSet() {
		TreeSet<Student> student = new TreeSet<>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student1);
		 
		Iterator<Student> iterator = student.iterator();
		assertEquals("Alice", iterator.next().getStudentName());
		assertEquals("Bob", iterator.next().getStudentName());
		assertEquals("John", iterator.next().getStudentName());
	}
	
	@Test
	public void testStudentWithMapToGetFavouriteFruit() {
		HashMap<String, String> student = new HashMap<>();
		student.put(student1.getStudentName(), "mango");
		student.put(student2.getStudentName(), "apple");
		student.put(student3.getStudentName(), "watermelon");
		
		assertEquals("mango", student.get(student1.getStudentName()));
		assertEquals("apple", student.get(student2.getStudentName()));
		assertEquals("watermelon", student.get(student3.getStudentName()));
		
		Set<String> studentKey = new HashSet<>();
		studentKey =  student.keySet();
		
		Collection<String> studentValue = new ArrayList<String>();
		studentValue = student.values();
		
	}
}
