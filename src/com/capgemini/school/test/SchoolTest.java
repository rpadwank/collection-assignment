package com.capgemini.school.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.school.model.School;

public class SchoolTest {

	private static School abcSchool;
	private static School defSchool;
	private static School ghiSchool;
	
	@BeforeClass
	public static void setUp() {
		abcSchool = new School("ABC", "Mumbai", "Mumbai District", 10);
		defSchool = new School("DEF", "Bangalore", "Jayanagar", 12);
		ghiSchool = new School("GHI", "Nashik", "Nashik district", 10);
	}

	@AfterClass
	public static void tearDown() {
		abcSchool = null;
		defSchool = null;
		ghiSchool = null;
	}

	@Test
	public void testSchoolToCheckInsertionOrderInArrayList() {
		ArrayList<School> school = new ArrayList<School>();
		school.add(abcSchool);
		school.add(defSchool);
		school.add(ghiSchool);
		
		Iterator<School> iterator = school.iterator();
		
		assertEquals(abcSchool, iterator.next());
		assertEquals(defSchool, iterator.next());
		assertEquals(ghiSchool, iterator.next());
	}
	
	@Test
	public void testSchoolToCheckDuplicatesInHashSet() {
		HashSet<School> school = new HashSet<>();
		school.add(abcSchool);
		school.add(defSchool);
		school.add(ghiSchool);
		school.add(abcSchool);
		 
		assertEquals(3, school.size());
	}
	

}
