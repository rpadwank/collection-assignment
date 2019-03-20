package com.capgemini.television.model;

import java.util.Objects;



public class Television {

	private String company;
	private String type;
	private boolean is3D;
	private double price;
	
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Television(String company, String type, boolean is3d, double price) {
		super();
		this.company = company;
		this.type = type;
		is3D = is3d;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isIs3D() {
		return is3D;
	}

	public void setIs3D(boolean is3d) {
		is3D = is3d;
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
		if(!(obj instanceof Television))
			return false;
		if(this==obj)
			return true;
		Television television = (Television) obj;
		if(this.company == television.company && this.type == television.type && this.price == television.price)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(company, type, price);
	}
}
