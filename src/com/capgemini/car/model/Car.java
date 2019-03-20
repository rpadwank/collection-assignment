package com.capgemini.car.model;

import java.util.Objects;

public class Car implements Comparable<Car> {
	private String company;
	private String model;
	private int year;
	private double price;
	
	public Car() {

	}
	
	public Car(String company, String model, int year, double price) {
		this.company = company;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(!(obj instanceof Car))
			return false;
		if(this==obj)
			return true;
		Car car = (Car) obj;
		if(this.company == car.company && this.model == car.model)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(company, model);
	}

	@Override
	public int compareTo(Car car) {
		return (company.compareTo(car.company));
	}
	
}
