package com.capgemini.school.model;

import java.util.Objects;

public class School {

	private String schoolName;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;
	public School() {
		
	}
	public School(String name, String city, String schoolDistrict, int greatSchoolRanking) {
		this.schoolName = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}
	public String getName() {
		return schoolName;
	}
	public void setName(String name) {
		this.schoolName = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSchoolDistrict() {
		return schoolDistrict;
	}
	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}
	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}
	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(!(obj instanceof School))
			return false;
		if(this==obj)
			return true;
		School school = (School) obj;
		if(this.schoolName == school.schoolName && this.city == school.city&& this.schoolDistrict== school.schoolDistrict)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(schoolName, city, schoolDistrict);
	}
	
}
