package com.capgemini.student.model;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private String studentName;
	private int studentId;
	
	public Student() {
	
	}

	public Student(String studentname, int studentId) {
		this.studentName = studentname;
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentname) {
		this.studentName = studentname;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(!(obj instanceof Student))
			return false;
		if(this==obj)
			return true;
		Student student= (Student) obj;
		if(this.studentId == student.studentId && this.studentName == student.studentName)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(studentId, studentName);
	}
	
	@Override
	public int compareTo(Student student) {
		return this.getStudentName().compareTo(student.getStudentName()) ;
	}
	
	
	
	
}
